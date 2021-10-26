package _2_基本线程机制._3_使用Executor;

import _2_基本线程机制._2_定义任务.LiftOff;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author ChenMingYang
 * @date 2021-10-25 22:11
 */
public class FixedThreadPool {
   public static void main(String[] args) {
       //Fixed线程池将指定固定数量的线程数在线程池中
       ExecutorService exec = Executors.newFixedThreadPool(5);
       for (int i = 0; i < 10; i++) {
           exec.execute(new LiftOff());
       }
       exec.shutdown();
   }
}
