package _2_基本线程机制._2_定义任务;

/**
 * @author ChenMingYang
 * @date 2021-10-25 20:36
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
}class Task02 implements Runnable {
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


public class Ex01 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Task01());
        Thread t2 = new Thread(new Task02());
        Thread t3 = new Thread(new Task03());
        t1.start();
        t2.start();
        t3.start();
    }
}
