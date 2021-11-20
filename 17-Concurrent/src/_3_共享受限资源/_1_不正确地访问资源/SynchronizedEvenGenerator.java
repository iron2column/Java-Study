package _3_共享受限资源._1_不正确地访问资源;

/**
 * @author ChenMingYang
 * @date 2021-11-20 16:17
 */
public class SynchronizedEvenGenerator extends IntGenerator {
    private int currentEvenValue = 0;

    @Override
    public synchronized int next() {
        ++currentEvenValue;
        Thread.yield();
        ++currentEvenValue;
        return currentEvenValue;
    }

    //----------------------------------------
    //编译：javac -d . *.java
    public static void main(String[] args) {
        EvenChecker.test(new SynchronizedEvenGenerator());
    }
}
