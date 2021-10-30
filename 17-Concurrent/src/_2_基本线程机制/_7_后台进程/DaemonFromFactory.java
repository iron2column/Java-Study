package _2_基本线程机制._7_后台进程;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author ChenMingYang
 * @date 2021-10-28 20:34
 */
public class DaemonFromFactory implements Runnable {

    @Override
    public void run() {
        while (true) {
            try {
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println(Thread.currentThread()+" "+this);
            } catch (InterruptedException e) {
                System.out.println("创建线程错误");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService exec = Executors.newCachedThreadPool(
                new DaemonThreadFactory()
        );
        for (int i = 0; i < 10; i++) {
            exec.execute(new DaemonFromFactory());
        }
        System.out.println("开始");
        //exec.shutdown();

        TimeUnit.MILLISECONDS.sleep(500);

        //exec.shutdown();
    }
}
