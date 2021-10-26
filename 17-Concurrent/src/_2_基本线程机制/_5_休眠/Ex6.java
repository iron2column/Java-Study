package _2_基本线程机制._5_休眠;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.*;

/**
 * @author ChenMingYang
 * @date 2021-10-26 17:48
 */
class SleepTask implements Callable<String> {
    public static int count = 0;
    private final int id = count++ ;
    private Random random = new Random();

    @Override
    public String call() throws Exception {
        int sleepTime = (random.nextInt(10) + 1);
        TimeUnit.SECONDS.sleep(sleepTime);
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < sleepTime; i++) {
            sb.append("-");
        }
        return sb+"线程 #"+id+" 睡眠了 "+sleepTime+" 秒";
    }
}

public class Ex6 {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();

        ArrayList<Future<String>> result = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            result.add(exec.submit(new SleepTask()));
        }

        for (Future<String> fs : result) {
            try {
                System.out.println(fs.get());
            } catch (InterruptedException e) {
                System.out.println(e);
                return;
            } catch (ExecutionException e) {
                e.printStackTrace();
            }finally {
                exec.shutdown();
            }
        }

    }
}
