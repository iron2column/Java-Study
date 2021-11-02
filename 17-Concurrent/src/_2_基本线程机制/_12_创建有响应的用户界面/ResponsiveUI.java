package _2_基本线程机制._12_创建有响应的用户界面;

import java.io.IOException;

/**
 * @author ChenMingYang
 * @date 2021-11-02 11:47
 */

/**
 * 无响应的UI
 */
class UnresponsiveUI {
    private static volatile double d = 1;

    public UnresponsiveUI() throws IOException {
        while (d > 0) {
            d = d + (Math.PI + Math.E) / d;
        }
        System.in.read();
    }
}

/**
 * 有响应的UI
 */
public class ResponsiveUI extends Thread {
    private static volatile double d = 1;

    public ResponsiveUI() {
        setDaemon(true);
        start();
    }

    @Override
    public void run() {
        while (true) {
            d = d + (Math.PI + Math.E) / d;
        }
    }

    public static void main(String[] args) throws IOException {
        //! new UnresponsiveUI();
        new ResponsiveUI();
        System.in.read();
        System.out.println(d);
    }

}
