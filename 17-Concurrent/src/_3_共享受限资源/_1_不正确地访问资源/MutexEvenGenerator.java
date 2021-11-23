package _3_共享受限资源._1_不正确地访问资源;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author ChenMingYang
 * @date 2021-11-23 11:42
 */
public class MutexEvenGenerator extends IntGenerator{
    private final Lock lock = new ReentrantLock();//作为常量唯一的锁

    private int concurrentValue = 0;
    @Override
    public int next() {
        lock.lock();
        try {
            ++concurrentValue;
            Thread.yield();
            ++concurrentValue;
            return concurrentValue;
        }finally {
            //finally会在try执行完和return之前进行执行
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        EvenChecker.test(new MutexEvenGenerator());//如果没有问题会一直运行
    }
}
