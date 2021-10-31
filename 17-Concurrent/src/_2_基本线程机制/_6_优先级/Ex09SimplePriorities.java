package _2_基本线程机制._6_优先级;

import _2_基本线程机制._7_后台进程.ThreadPrioritiesFactory;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 优先级交给{@link _2_基本线程机制._7_后台进程.ThreadPrioritiesFactory}去做
 * @author ChenMingYang
 * @date 2021-10-31 13:25
 */
public class Ex09SimplePriorities implements Runnable {
    private int countDown = 5;
    private volatile double d;
    private int priority;
    @Override
    public String toString() {
        return Thread.currentThread() + ": " + countDown;
    }

    @Override
    public void run() {
        while (true) {
            for (int i = 1; i < 100000; i++) {
                d += (Math.PI + Math.E) / ((double) i);
                if (i % 1000 == 0) {
                    Thread.yield();
                }
            }
            System.out.println(this);
            if (--countDown == 0) return;
        }
    }

    public static void main(String[] args) {
        //由于该ExecutorService的线程工厂已经设置为ThreadPrioritiesFactory
        //所以给该ExecutorService传入的Runnable都会被工厂进行改造生产
        ExecutorService exec = Executors.newCachedThreadPool(new ThreadPrioritiesFactory());
        for (int i = 0; i < 5; i++) {
            exec.execute(new Ex09SimplePriorities());
        }
        exec.execute(new Ex09SimplePriorities());
        exec.shutdown();
    }

}
