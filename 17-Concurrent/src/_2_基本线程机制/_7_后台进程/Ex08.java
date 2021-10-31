package _2_基本线程机制._7_后台进程;

import _2_基本线程机制._2_定义任务.LiftOff;

/**
 * 看不懂
 * @author ChenMingYang
 * @date 2021-10-31 12:58
 */

public class Ex08 {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < 20; i++) {
                Thread t = new Thread(new LiftOff());
                t.setDaemon(true);
                t.start();
            }
            System.out.println("Waiting for LiftOff");
        }finally {
            System.out.println("finally out of main");
        }

    }

}
