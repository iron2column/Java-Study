package _3_共享受限资源._1_不正确地访问资源;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author ChenMingYang
 * @date 2021-11-20 16:36
 */
class Task implements Runnable {
    private final int id;
    private Ex11 ex;

    public Task(Ex11 ex,int id) {
        this.id = id;
        this.ex = ex;
    }

    @Override
    public void run() {
        while (!ex.isCanceled()) {
            ex.operation();//不确定性操作 加锁
            int val1 = ex.getDataFiled1();// 和上面的锁并没有互斥
            int val2 = ex.getDataFiled2();// 和上面的锁并没有互斥
            if (val1 != val2) {
                System.out.println("==stop== #" + this.id + " " + val1 + " != " + val2);
                ex.cancel();
            } else {
                System.out.println("#"+this.id+" "+val1+"  "+val2);
            }
        }

    }
}
public class Ex11 extends IntGenerator{
    private int dataFiled1=0;
    private int dataFiled2=0;

    public synchronized void operation() {
        //do something...
        ++dataFiled1;
        ++dataFiled2;
        ++dataFiled1;
        ++dataFiled2;
    }

    public synchronized int getDataFiled1() {
        return dataFiled1;
    }

    public synchronized int getDataFiled2() {
        return dataFiled2;
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        Ex11 onlyOneEx = new Ex11();
        for (int i = 0; i < 2; i++) {
            exec.execute(new Task(onlyOneEx,i));
        }
        exec.shutdown();
    }

    @Override
    public int next() {
        return 0;
    }
}
