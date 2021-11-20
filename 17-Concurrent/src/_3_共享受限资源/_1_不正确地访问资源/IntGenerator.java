package _3_共享受限资源._1_不正确地访问资源;

/**
 * @author ChenMingYang
 * @date 2021-11-02 13:51
 */
public abstract class IntGenerator {

    /**
     * 抽象方法,需要被具体实现
     */
    public abstract int next();

    //volatile将在后面原子性学习
    /**
     * 标志符
     */
    private volatile boolean canceled = false;

    /**
     * 设置标志符为true
     */
    public void cancel() {
        this.canceled = true;
    }

    /**
     * 返回标志符状态
     * @return
     */
    public boolean isCanceled() {
        return canceled;
    }
}
