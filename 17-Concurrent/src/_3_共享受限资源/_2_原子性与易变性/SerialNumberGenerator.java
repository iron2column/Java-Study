package _3_共享受限资源._2_原子性与易变性;

/**
 * @author ChenMingYang
 * @date 2021-11-27 15:00
 */
public class SerialNumberGenerator {
    private static volatile int serialNumber = 0;

    public static int nextSerialNumber() {
        return serialNumber++;//线程不安全
    }

}

class TaskForSerialNumber implements Runnable{
    @Override
    public void run() {
        while (true) {
            int val = SerialNumberGenerator.nextSerialNumber();
            System.out.println(this + " val=" + val);
        }
    }
}

