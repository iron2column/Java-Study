package _4_终结任务._1_装饰性花园;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * 装饰性花园
 *
 * @author ChenMingYang
 * @date 2021-12-07 19:44
 */
public class OrnamentalGarden {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService exec = Executors.newCachedThreadPool();

        for (int i = 0; i < 5; i++) {
            exec.execute(new Entrance(i));
        }

        TimeUnit.SECONDS.sleep(3);

        Entrance.cancel();

        exec.shutdown();

    }
}

/**
 * 计数器
 */
class Count {
    private int count = 0;

    private Random rand = new Random(47);

    //todo rm keyword->'synchronized' to see the result

    /**
     * 计数器增加1
     *
     * @return
     */
    public synchronized int increment() {
        int temp = count;
        if (rand.nextBoolean()) Thread.yield();//随机让出线程
        return (count = ++temp);
    }

    /**
     * 获取当前记数
     *
     * @return
     */
    public synchronized int value() {
        return count;
    }

}

/**
 * 入口任务->进入增加记录<br>
 * <p>全局拥有的：
 * <li>一个计数器{@link Entrance#count}——{@link Count}</li>
 * <li>一个入口任务表{@link Entrance#entrances}——{@link ArrayList}</li><br>
 * </p>
 *
 * <p>每一个入口带有:
 * <li>一个id序号{@link Entrance#id}</li>
 * <li>一个取消标志{@link Entrance#canceled}</li>
 * <li>一个数量{@link Entrance#number}</li>
 * </p>

 */
class Entrance implements Runnable {
    /**
     * 任务id序号
     */
    private final int id;
    /**
     * 安置一个计数器
     */
    private static Count count = new Count();
    /**
     * 入口任务列表
     */
    private static List<Entrance> entrances = new ArrayList<>();
    /**
     * 取消标志
     */
    private static volatile boolean canceled = false;
    /**
     * 数量
     */
    private int number = 0;

    //--------------------------------
    public Entrance(int id) {
        this.id = id;
        //保存本任务到容器内。同时也防止对死亡任务的垃圾收集
        entrances.add(this);
    }
    //--------------------------------

    /**
     * 将取消标记设为true
     */
    public static void cancel() {
        canceled = true;
    }

    @Override
    public void run() {
        while (!canceled) {//没有取消就一直运行
            synchronized (this) {
                ++number;
            }

            System.out.println(this + " 总计： " + count.increment());

            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("睡眠被中断");
            }

            System.out.println("正在停止 "+this);
        }
    }

    public synchronized int getValue() {
        return number;
    }

    public static int getTotalCount() {
        return count.value();
    }

    /**
     * 总计流量
     * @return
     */
    public static int sumEntrances() {
        int sum = 0;
        for (Entrance entrance : entrances) {
            sum += entrance.getValue();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "入口 " + id + ": " + getValue();
    }
}

