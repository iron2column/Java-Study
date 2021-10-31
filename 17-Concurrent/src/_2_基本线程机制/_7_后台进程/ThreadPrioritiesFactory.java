package _2_基本线程机制._7_后台进程;

import java.util.Random;
import java.util.concurrent.ThreadFactory;

/**
 * 可以非自主设置（随机）线程优先级
 * @author ChenMingYang
 * @date 2021-10-31 13:09
 */
public class ThreadPrioritiesFactory implements ThreadFactory {
    Random random = new Random();

    /**
     * 返回{@link Thread} 对象
     * @param r
     * @return
     */
    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        int rand = random.nextInt(3);
        switch (rand) {
            case 0: thread.setPriority(Thread.MIN_PRIORITY);break;
            case 1: thread.setPriority(Thread.NORM_PRIORITY);break;
            case 2: thread.setPriority(Thread.MAX_PRIORITY);break;
            default:
        }
        return thread;
    }
}
