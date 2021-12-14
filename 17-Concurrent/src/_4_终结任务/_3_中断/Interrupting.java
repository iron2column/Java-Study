package _4_终结任务._3_中断;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * 中断
 *
 * @author ChenMingYang
 * @date 2021-12-14 14:34
 */
public class Interrupting {
    private static ExecutorService exec = Executors.newCachedThreadPool();

    /**
     * 单个测试Runnable的cancel()
     * @param runnable
     * @throws InterruptedException
     */
    static void test(Runnable runnable) throws InterruptedException {
        Future<?> f = exec.submit(runnable); //让线程任务开始执行

        TimeUnit.MILLISECONDS.sleep(100);

        String full = runnable.getClass().getName();
        String name = full.substring(full.lastIndexOf(".")+1);

        System.out.println("[开始中断]\t" + name);

        f.cancel(true);//进行中断

        System.out.println("[中断信号已发送给]\t"+ name+"\n");
    }

    public static void main(String[] args) throws InterruptedException {
        test(new SleepBlocked());
        test(new IOBlocked(System.in));
        test(new SynchronizedBlocked());

        TimeUnit.SECONDS.sleep(3);
        System.out.println("\n系统结束");
        System.exit(0);
    }
}

/**
 * 睡眠阻塞
 */
class SleepBlocked implements Runnable {
    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("\t\t如果被中断，应该打出这句：捕获中断异常");
        }
        System.out.println("\t\t退出 -> SleepBlocked.run()");
    }
}

/**
 * IO阻塞
 */
class IOBlocked implements Runnable {
    private InputStream in;

    public IOBlocked(InputStream in) {
        this.in = in;
    }

    @Override
    public void run() {
        try {
            System.out.println("\t\tIO等待read：");
            in.read();
        } catch (IOException e) {
            if (Thread.currentThread().isInterrupted()) {
                System.out.println("\t\t如果被中断，应该打出这句：IO阻塞中进行中断");
            } else {
                throw new RuntimeException(e);
            }
        }
        System.out.println("\t\t退出 -> IOBlocked.run()");
    }
}

/**
 * 同步阻塞
 */
class SynchronizedBlocked implements Runnable {
    public SynchronizedBlocked() {
        new Thread() {
            @Override
            public void run() {
                f();
            }
        }.start();
    }

    public synchronized void f() {
        while (true) {
            Thread.yield();
        }
    }

    @Override
    public void run() {
        System.out.println("\t\t尝试获取调用f()");
        f();
        System.out.println("\t\t退出 -> synchronizedBlocked.run()");
    }
}
