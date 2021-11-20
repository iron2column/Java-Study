package _2_基本线程机制._7_后台进程;

import java.util.concurrent.TimeUnit;

/**
 * @author ChenMingYang
 * @date 2021-10-31 11:10
 */
class ADaemon implements Runnable {

    @Override
    public void run() {
        System.out.println("ADaemon开始启动");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            System.out.println("发生InterruptedException异常终止");
        }finally {
            System.out.println("This is should always run?");
        }
    }
}

public class DaemonDontRunFinally {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new ADaemon());
        t.setDaemon(true);
        t.start();
        //main线程如果不等待，则守护线程的finally不会运行，这是为什么？
        TimeUnit.SECONDS.sleep(2);

    }
}
