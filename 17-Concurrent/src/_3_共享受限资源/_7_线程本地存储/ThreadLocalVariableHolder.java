package _3_共享受限资源._7_线程本地存储;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author ChenMingYang
 * @date 2021-12-05 16:56
 */
public class ThreadLocalVariableHolder {

    /**
     * 静态ThreadLocal -存储类型-> Integer
     */
    private static ThreadLocal<Integer> value = new ThreadLocal<Integer>() {
        private Random rand = new Random(47);
        @Override
        protected synchronized Integer initialValue() {
            // 自己定义的方法？
            return rand.nextInt();
        }
    };

    /**
     * 对线程本地存储对象的操作 ——> 增1
     */
    public static void increment() {
        value.set(value.get() + 1);
    }

    /**
     * 对线程本地存储对象的操作 ——> 读
     *
     * @return
     */
    public static int get() {
        return value.get();
    }

    public static void moreOptions() {
        value.remove();
    }

    //----------------------------------------------------
    public static void main(String[] args) throws InterruptedException {
        ExecutorService exec = Executors.newCachedThreadPool();

        /* 让5个线程 */
        for (int i = 0; i < 5; i++) {
            exec.execute(new Accessor(i));
        }

        TimeUnit.SECONDS.sleep(3);
        exec.shutdownNow();
    }


}

class Accessor implements Runnable {
    /**
     * 任务序号
     */
    private final int id;

    public Accessor(int idn) {
        this.id = idn;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            ThreadLocalVariableHolder.increment();
            System.out.println(this);
            Thread.yield();
        }
    }

    @Override
    public String toString() {
        return "#" + id + " : " + ThreadLocalVariableHolder.get();
    }
}

