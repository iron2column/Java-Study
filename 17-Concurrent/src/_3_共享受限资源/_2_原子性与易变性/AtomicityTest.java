package _3_共享受限资源._2_原子性与易变性;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 将访操作同一变量的方法加上synchronized锁
 * @author ChenMingYang
 * @date 2021-11-27 14:26
 */
public class AtomicityTest implements Runnable {
    private int i =0;

    public synchronized int getValue() {
        return i;//4.返回成一个奇数
    }

    /**
     * synchronized同步方法<br/>
     * 按理来说i的值应该是「0 2 4 6 ... 偶数」
     */
    private synchronized void evenIncrement() {
        i++; //1.某一时刻线程运行到这里结束变为奇数
        i++; // 2.准备执行这里结果被另一线程抢去执行
    }

    @Override
    public void run() {
        while (true) {
            evenIncrement();
        }
    }

    //————————————————————————
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        AtomicityTest at = new AtomicityTest();
        exec.execute(at);

        while (true) {
            int val = at.getValue();//3.被这里执行
            if (val % 2 != 0) {//非偶数
                System.out.println(val);
                System.exit(0);
            }
        }

    }
}
