package _3_共享受限资源._1_不正确地访问资源;

/**
 * @author ChenMingYang
 * @date 2021-11-20 11:28
 */
public class EvenGenerator extends IntGenerator {
    /**
     * 初始化偶数值
     */
    private int currentEvenValue = 0;

    /**
     * 理想状态下，next返回的应该是一个偶数
     */
    @Override
    public int next() {
        ++currentEvenValue;//危险点!
        //Thread.yield();//更快的发现失败
        ++currentEvenValue;
        return currentEvenValue;
    }

    //---------------------------
    public static void main(String[] args) {
        EvenChecker.test(new EvenGenerator(),10);
    }

}
