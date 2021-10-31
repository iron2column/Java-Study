package _2_基本线程机制._7_后台进程;

import java.util.concurrent.TimeUnit;

/**
 * @author ChenMingYang
 * @date 2021-10-31 12:47
 */
public class Ex07 {
    public static void main(String[] args) throws InterruptedException {
        //令第一线程为守护线程，以此看后续创建线程是否为守护线程
        Thread d = new Thread(new Daemon());
        //d线程的守护性决定了它派生出的线程都是守护线程
        d.setDaemon(true);
        d.start();

        System.out.println("d.isDaemon() = " + d.isDaemon() + ", ");

        //由于守护线程会在main线程结束也跟着结束，所以为了让守护线程完成任务再消失
        //让main线程等待，使守护线程能完成线程们的过程
        //在1纳秒中，可以明显看到，只有部分守护线程在main()运行的这1纳秒启动
        TimeUnit.NANOSECONDS.sleep(1);
    }
}

