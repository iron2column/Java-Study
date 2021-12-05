package _3_共享受限资源._3_临界区;

/**
 * @author ChenMingYang
 * @date 2021-12-05 13:11
 */
public class SyncObject {
    public static void main(String[] args) {
        DyncObject dj = new DyncObject();

        new Thread(() -> dj.f()).start();

        dj.g();
    }
}

class DyncObject {
    private Object syncObject = new Object();

    public synchronized void f() {
        for (int i = 0; i < 5; i++) {
            System.out.println("f()");
            Thread.yield();
        }
    }

    public void g() {
        synchronized (syncObject) {
            for (int i = 0; i < 5; i++) {
                System.out.println("\t\tg()");
                Thread.yield();
            }
        }
    }
}