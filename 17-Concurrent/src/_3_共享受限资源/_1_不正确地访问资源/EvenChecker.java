package _3_共享受限资源._1_不正确地访问资源;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 消费者任务
 * @author ChenMingYang
 * @date 2021-11-02 13:51
 */
public class EvenChecker implements Runnable {
    private IntGenerator generator;
    private final int id;

    /**
     * @param generator {@link IntGenerator}实例
     * @param id 标志id
     */
    public EvenChecker(IntGenerator generator, int id) {
        this.generator = generator;
        this.id = id;
    }

    @Override
    public void run() {
        while (!generator.isCanceled()) {//没被取消就循环
            int val = generator.next();//实现next的函数并不是原子性的，因此
            if (val % 2 != 0) {
                System.out.println(val + " 不是偶数"+"from 线程id="+this.id);
                generator.cancel();
            }
        }
    }

    /**
     * @param gp {@link IntGenerator}的任意实现类实例
     * @param count 线程数量
     */
    public static void test(IntGenerator gp, int count) {
        System.out.println("按下 Control-C 可退出");

        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < count; i++) {
            //生成并执行count个线程：
            // 执行具有相同IntGenerator对象的EvenChecker实例
            // i只是标志符
            exec.execute(new EvenChecker(gp, i));
        }

        exec.shutdown();
    }

    /**
     * 默认线程数为10的测试
     * @param gp
     */
    public static void test(IntGenerator gp) {
        test(gp, 10);
    }
}
