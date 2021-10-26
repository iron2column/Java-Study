package _2_基本线程机制._3_使用Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 * @author ChenMingYang
 * @date 2021-10-26 08:33
 */
class Task01 implements Runnable {
    public Task01() {
        System.out.println("任务01--启动...");
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("一条消息来自 Task01");
            Thread.yield();
        }
        System.out.println("任务01--结束");
        return;
    }
}

class Task02 implements Runnable {
    public Task02() {
        System.out.println("任务02--启动...");
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("一条消息来自 Task02");
            Thread.yield();
        }
        System.out.println("任务02--结束");
        return;
    }
}

class Task03 implements Runnable {
    public Task03() {
        System.out.println("任务03--启动...");
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("一条消息来自 Task03");
            Thread.yield();
        }
        System.out.println("任务03--结束");
        return;
    }
}

public class Ex03 {
    public static void main(String[] args) {
        ScheduledExecutorService exec = Executors.newScheduledThreadPool(1);
        for (int i = 0; i < 5; i++) {
            exec.execute(new Task01());
            exec.execute(new Task02());
            exec.execute(new Task03());
        }
        exec.shutdown();
        System.out.println("===========");
        ExecutorService execWSP = Executors.newWorkStealingPool();
        for (int i = 0; i < 5; i++) {
            execWSP.execute(new Task01());
            execWSP.execute(new Task02());
            execWSP.execute(new Task03());
        }
        exec.shutdown();
    }
}
