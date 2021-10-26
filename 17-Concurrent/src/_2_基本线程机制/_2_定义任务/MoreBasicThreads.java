package _2_基本线程机制._2_定义任务;

/**
 * @author ChenMingYang
 * @date 2021-10-25 20:15
 */
public class MoreBasicThreads {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new LiftOff()).start();
        }
        System.out.println("Waiting for launch");
    }
}
