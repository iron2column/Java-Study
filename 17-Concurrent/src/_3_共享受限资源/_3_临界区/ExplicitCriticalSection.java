package _3_共享受限资源._3_临界区;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 显式临界区（以使用Lock对象的方式）
 *
 * @author ChenMingYang
 * @date 2021-11-30 18:20
 */
public class ExplicitCriticalSection {
    public static void main(String[] args) {
        PairManager
                pm1 = new ExplicitPairManager1(),
                pm2 = new ExplicitPairManager2();

        CriticalSection.testApproaches(pm1,pm2);
    }
}

/**
 * 方式1：将线程安全的方法也放入临界区
 */
class ExplicitPairManager1 extends PairManager {
    //想要显式声明临界区 得要锁对象啊
    private Lock lock = new ReentrantLock();

    @Override
    public synchronized void increment() {
        lock.lock();
        try {//临界区
            p.incrementX();
            p.incrementY();
            store(getPair());
        } finally {
            lock.unlock();
        }
    }
}

/**
 * 方式2：线程安全的方法提出临界区
 */
class ExplicitPairManager2 extends PairManager {
    private Lock lock = new ReentrantLock();

    @Override
    public void increment() {
        Pair temp;
        lock.lock();
        try {
            p.incrementX();
            p.incrementY();
            temp = getPair();
        } finally {
            lock.unlock();
        }
        store(temp);

    }
}

