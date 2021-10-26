package _2_基本线程机制._2_定义任务;

/**
 * @author ChenMingYang
 * @date 2021-10-25 19:09
 */
public class LiftOff implements Runnable {
    protected int countDown = 10;
    /**
     * 作为本类所有实例的共享数据
     */
    private static int taskCount = 0;
    /**
     * 标注实例序号
     * 作为常量初始化后不被改变
     */
    private final int id = taskCount++;

    public LiftOff() {
    }

    public LiftOff(int countDown) {
        this.countDown = countDown;
    }

    public String status() {
        return "#" + id + "(" + (countDown > 0 ? countDown : "LiftOff!") + "), ";
    }

    @Override
    public void run() {
        while (countDown-- > 0) {
            System.out.print(status());
            Thread.yield();
        }
    }
}
