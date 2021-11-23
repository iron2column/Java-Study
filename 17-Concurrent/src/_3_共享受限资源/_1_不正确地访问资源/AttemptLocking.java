package _3_共享受限资源._1_不正确地访问资源;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author ChenMingYang
 * @date 2021-11-23 12:28
 */
public class AttemptLocking {
    private Lock lock = new ReentrantLock();

    //--------------------------------
    public static void main(String[] args) {
        final AttemptLocking al = new AttemptLocking();

        al.untimed();
        al.timed();
        /*
        lock.tryLock() = true
        lock.tryLock(2,TimeUnit.SECONDS) = true
         */

        //.............单线程测试锁
        System.out.println();
        //.............多线程测试锁

        new Thread() {
            {
                setDaemon(true);//先行执行
            }
            @Override
            public void run() {
                al.lock.lock();//守护线程抢占了锁
                System.out.println("acquired");
            }
        }.start();
        Thread.yield();//给上面的线程一个机会，多试几次
        al.untimed();
        al.timed();
        /*
        acquired
        lock.tryLock() = false
        lock.tryLock(2,TimeUnit.SECONDS) = false
         */
    }

    public void untimed_mine() {
        boolean capture = lock.tryLock();//是否获得锁
        if (capture) {//true 获得锁
            try {
                //多线程操作
            } finally {
                lock.unlock();//解锁
            }
        } else {//没有获得锁
            //执行一般的替代操作
        }

    }

    /**
     * 只进行一次trylock() 未获得锁则不再尝试
     */
    public void untimed() {
        boolean capture = lock.tryLock();

        try {
            System.out.println("lock.tryLock() = " + capture);
        } finally {
            if (capture) {
                lock.unlock();//unlock有使用限制，必须是锁的拥有者才能unlock，否则会抛出异常，因此需要注意
            }
        }

    }

    /**
     * 直接进行一次trylock()，如果没有获得则拥有一次在指定时间内再次执行trylock()机会<br/>
     * 前提是当前线程没有在这段时间内被中断
     */
    public void timed() {
        boolean capture = false;
        try {
            capture = lock.tryLock(2, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            System.out.println("lock.tryLock(2,TimeUnit.SECONDS) = " + capture);
        } finally {
            if (capture) {
                lock.unlock();
            }
        }
    }


}
