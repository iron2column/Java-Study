package _4_终结任务._1_装饰性花园;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author ChenMingYang
 * @date 2021-12-12 12:49
 */
public class AwaitTermination {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService exec = Executors.newCachedThreadPool();
        boolean isFinished = exec.awaitTermination(1, TimeUnit.SECONDS);

    }
}
