package _3_共享受限资源._3_临界区;

import java.util.concurrent.locks.ReentrantLock;

/**
 * <p>创建一个类，它具有三个方法，这些方法包含一个临界区</p>
 * 所有对该临界区的同步都是在 <b>同一个对象上的</b>创建多个任务来演示这些方法同时只能运行一个。<br>
 * 现在修改这些方法，使得每个方法都在不同的对象上同步，并展示所有三个方法可以同时运行。<br>
 *
 * @author ChenMingYang
 * @date 2021-12-05 13:58
 */
public class Ex15andEx16 {
    public static void main(String[] args) {
        CRITICAL c = new CRITICAL();
        //三个线程调用不同的临界区方法
        new Thread(c::f1).start();
        new Thread(c::f2).start();
        new Thread(c::f3).start();
    }
}

/**
 * 拥有三个含有临界区的方法
 */
class CRITICAL {
    /**
     * 同步对象
     */
    private Object syncObject = new Object();

    /**
     * 整个方法同步
     */
    public synchronized void f1() {
        for (int i = 0; i < 5; i++) {
            System.out.println("f1()");
            Thread.yield();
        }
    }

    public void f2() {
        synchronized (syncObject) {
            for (int i = 0; i < 5; i++) {
                System.out.println("\tf2()");
                Thread.yield();
            }
        }

    }

    public void f3() {
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("\t\tf3()");
                Thread.yield();
            }
        } finally {
            lock.unlock();
        }
    }

}
