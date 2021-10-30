package _2_基本线程机制._7_后台进程;

import java.util.concurrent.ThreadFactory;

/**
 * @author ChenMingYang
 * @date 2021-10-28 20:28
 */
public class DaemonThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setDaemon(true);
        return t;
    }
}
