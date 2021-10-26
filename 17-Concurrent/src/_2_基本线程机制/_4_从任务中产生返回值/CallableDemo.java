package _2_基本线程机制._4_从任务中产生返回值;

import java.util.ArrayList;
import java.util.concurrent.*;

/**
 * @author ChenMingYang
 * @date 2021-10-26 10:51
 */

class TaskWithResult implements Callable<String> {
    private int id;

    public TaskWithResult(int id) {
        this.id = id;
    }

    @Override
    public String call() throws Exception {
        return "result of TaskWithResult " + id;
    }
}

public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        ArrayList<Future<String>> result = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            result.add(exec.submit(new TaskWithResult(i)));
        }

        System.out.println(result);

        for (Future<String> fs : result) {
            try {
                System.out.println(fs.get());
            } catch (InterruptedException e) {
                System.out.println(e);
                return;
            } catch (ExecutionException e) {
                System.out.println(e);
            }finally {
                exec.shutdown();
            }
        }

    }
}
