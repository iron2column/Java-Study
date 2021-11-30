package _3_共享受限资源._3_临界区;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Pair -> {x,y}
 * 线程不安全 <br>
 * x -> getX/incrementX <br>
 * y -> getY/incrementY <br>
 */
class Pair {
    private int x, y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Pair() {
        this(0, 0);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void incrementX() {
        x++;
    }

    public void incrementY() {
        y++;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public void checkState() {
        if (x != y) {
            throw new PairValuesNotEqualException();
        }
    }

    public class PairValuesNotEqualException extends RuntimeException {
        public PairValuesNotEqualException() {
            super("Pair Values Not Equal: " + Pair.this);
        }
    }
}

/**
 * 管理Pair的抽象类
 */
abstract class PairManager {
    /**
     * 记录管理的Pair实例<br>
     * 使用{@link Collections#synchronizedList(List)}进行线程安全的存储器
     */
    private final List<Pair> storage = Collections.synchronizedList(new ArrayList<Pair>());

    /**
     * 初始化一次管理对象的模版.
     * <br>以便利用
     */
    protected Pair p = new Pair();

    AtomicInteger checkCounter = new AtomicInteger(0);

    /**
     * 总是生成新的Pair实例返回<br>
     * 构造参数是模版{@link #p}的x和y
     *
     * @return {@link Pair}
     */
    public synchronized Pair getPair() {
        return new Pair(p.getX(), p.getY());
    }

    /**
     * 存储管理的{@link Pair}实例
     *
     * @param p {@link Pair}
     */
    protected void store(Pair p) {
        storage.add(p);
        try {
            TimeUnit.MILLISECONDS.sleep(50);
        } catch (InterruptedException e) {
        }
    }

    /**
     * 对{x,y}进行增加的方法.
     */
    public abstract void increment();
}

/**
 * 对方法进行同步的Pair管理器类
 */
class PairManager1 extends PairManager {

    /**
     * {@inheritDoc}
     * <p>但是对整个方法加上了线程同步锁</p>
     * 对管理器的模版{@link PairManager#p}进行x,y增1
     */
    @Override
    public synchronized void increment() {
        p.incrementX();
        p.incrementY();
        store(getPair());
    }
}

/**
 * 使用临界区进行同步的Pair管理器
 */
class PairManager2 extends PairManager {

    /**
     * {@inheritDoc}
     * <p>但是对方法使用了临界区</p>
     * 对管理器的模版{@link PairManager#p}进行x,y增1
     */
    @Override
    public void increment() {
        Pair temp;
        synchronized (this) {
            p.incrementX();
            p.incrementY();
            temp = getPair();
        }
        store(temp);
    }
}

//-------------------------------------------------

/**
 * 「Pair对儿」的操纵任务
 */
class PairManipulator implements Runnable {

    private PairManager pm;

    /**
     * 必须要给定一个已实现的Pair管理器<br>
     * (consider add one default pm)
     *
     * @param pm
     */
    public PairManipulator(PairManager pm) {
        this.pm = pm;
    }

    @Override
    public void run() {
        while (true) {
            pm.increment();
        }
    }

    @Override
    public String toString() {
        return "Pair: " + pm.getPair() + " checkCounter = " + pm.checkCounter.get();
    }

}

/**
 * 「Pair对儿」的检查任务
 */
class PairChecker implements Runnable {
    private PairManager pm;

    public PairChecker(PairManager pm) {
        this.pm = pm;
    }

    @Override
    public void run() {
        while (true) {
            pm.checkCounter.incrementAndGet();
            pm.getPair().checkState();
        }
    }
}

//-------------------------------------------------

/**
 * @author ChenMingYang
 * @date 2021-11-27 15:17
 */
public class CriticalSection {

    public static void main(String[] args) {
        PairManager
                pman1 = new PairManager1(),
                pman2 = new PairManager2();

        testApproaches(pman1, pman2);
    }

    static void testApproaches(PairManager pman1, PairManager pman2) {
        ExecutorService exec = Executors.newCachedThreadPool();

        PairManipulator
                操作_task1 = new PairManipulator(pman1),
                操作_task2 = new PairManipulator(pman2);

        PairChecker
                检查_1 = new PairChecker(pman1),
                检查_2 = new PairChecker(pman2);

        exec.execute(操作_task1);
        exec.execute(检查_1);

        exec.execute(操作_task2);
        exec.execute(检查_2);

        try {
            TimeUnit.MILLISECONDS.sleep(500);
            //等其他执行500毫秒再做统计
        } catch (InterruptedException e) {
            System.out.println("Sleep interrupted");
        }

        System.out.println("从结果可以看出：使用临界区进行同步使得在相同时间内进行资源访问的效率更高");
        System.out.println("pm1: " + 操作_task1);
        System.out.println("pm2: " + 操作_task2);
        System.exit(0);

    }
}
