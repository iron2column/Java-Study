package _2_基本线程机制._7_后台进程;

/**
 * @author ChenMingYang
 * @date 2021-10-30 19:49
 */

import java.util.concurrent.TimeUnit;

/**
 * 守护进程
 */
class Daemon implements Runnable {
    private Thread[] t = new Thread[10];
    @Override
    public void run() {
        //产生并存储线程
        for (int i = 0; i < t.length; i++) {
            t[i] = new Thread(new DaemonSpawn());
            t[i].start();
            System.out.println("DaemonSpawn " + i + " started, ");
        }
        //线程判断
        for (int i = 0; i < t.length; i++) {
            System.out.println("t["+i+"].isDaemon() = "+t[i].isDaemon());
        }
        while (true) {
            Thread.yield();
        }

    }
}

/**
 * 模拟某种线程任务，简单起见任务设置的很简单
 */
class DaemonSpawn implements Runnable {
    @Override
    public void run() {
        while (true) {
            Thread.yield();
        }
    }
}

public class Daemons {
    public static void main(String[] args) throws InterruptedException {
        //令第一线程为守护线程，以此看后续创建线程是否为守护线程
        Thread d = new Thread(new Daemon());
        //d线程的守护性决定了它派生出的线程都是守护线程
        d.setDaemon(true);
        d.start();

        System.out.println("d.isDaemon() = " + d.isDaemon() + ", ");

        //由于守护线程会在main线程结束也跟着结束，所以为了让守护线程完成任务再消失
        //让main线程等待，使守护线程能完成线程们的过程
        TimeUnit.SECONDS.sleep(1);
    }
}
