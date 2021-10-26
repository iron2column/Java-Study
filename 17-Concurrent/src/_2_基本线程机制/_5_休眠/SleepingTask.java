package _2_基本线程机制._5_休眠;

import _2_基本线程机制._2_定义任务.LiftOff;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author ChenMingYang
 * @date 2021-10-26 17:06
 */
public class SleepingTask extends LiftOff {
    @Override
    public void run() {
        while (countDown-- > 0) {
            System.out.println(status());
            //老派：Thread.sleep(100)
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            exec.execute(new SleepingTask());
        }
        exec.shutdown();
    }
}
