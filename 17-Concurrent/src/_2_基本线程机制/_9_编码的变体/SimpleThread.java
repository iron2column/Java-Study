package _2_基本线程机制._9_编码的变体;

/**
 * @author ChenMingYang
 * @date 2021-10-31 14:20
 */
public class SimpleThread extends Thread {
    private int countDown = 5;
    private static int threadCount = 0;

    //生产此类时线程就创建并启动了
    public SimpleThread() {
        //这里传入的是设置线程的名字，也就是Thread的name属性
        super(Integer.toString(++threadCount));
        start();
    }

    @Override
    public String toString() {
        return "#"+getName()+"("+countDown+"), ";
    }

    @Override
    public void run() {
        while (true) {
            System.out.print(this);
            if (--countDown == 0) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new SimpleThread();
        }
    }
}
