package _2_基本线程机制._2_定义任务;

/**
 * @author ChenMingYang
 * @date 2021-10-25 19:54
 */
public class BasicThreads {
    public static void main(String[] args) {
        Thread t = new Thread(new LiftOff());
        t.start();
        System.out.println("Waiting for LiftOff");
    }
}
