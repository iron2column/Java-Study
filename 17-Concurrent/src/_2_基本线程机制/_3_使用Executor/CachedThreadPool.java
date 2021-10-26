package _2_基本线程机制._3_使用Executor;

import _2_基本线程机制._2_定义任务.LiftOff;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author ChenMingYang
 * @date 2021-10-25 21:37
 */
public class CachedThreadPool {
    public static void main(String[] args) {
        //创建一个线程池进行线程的重复使用从而避免线程浪费
        ExecutorService exec = Executors.newCachedThreadPool();

        for (int i = 0; i < 5; i++) {
            exec.execute(new LiftOff());
        }

        exec.shutdown();
    }
}
