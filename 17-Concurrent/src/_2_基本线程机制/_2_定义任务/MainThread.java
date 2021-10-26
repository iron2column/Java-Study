package _2_基本线程机制._2_定义任务;

/**
 * @author ChenMingYang
 * @date 2021-10-25 19:31
 */
public class MainThread {
    public static void main(String[] args) {
        LiftOff launch = new LiftOff();
        launch.run();
    }
}
