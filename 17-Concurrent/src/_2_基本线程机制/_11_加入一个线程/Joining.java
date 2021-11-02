package _2_基本线程机制._11_加入一个线程;

/**
 * @author ChenMingYang
 * @date 2021-10-31 17:11
 */
class Sleeper extends Thread {
    private int duration;

    public Sleeper(String name, int sleepTime) {
        super(name);
        duration = sleepTime;
        start();
    }

    @Override
    public void run() {
        try {
            System.out.println(getName()+" 准备要睡上 "+duration+" 毫秒");
            sleep(duration);
        } catch (InterruptedException e) {
            System.out.println(getName() + " 被中断线程了 " + "isInterrupted(): " + isInterrupted());
            return;
        }
        System.out.println(getName() + " 已经睡醒了 ");
    }
}

class Joiner extends Thread {
    //Joiner要加入的目标线程
    private Sleeper sleeper;

    public Joiner(String name, Sleeper sleeper) {
        super(name);
        this.sleeper = sleeper;
        start();
    }

    @Override
    public void run() {
        try {
            System.out.print(getName()+" 准备要加入 "+sleeper.getName()+" 了 ————");
            System.out.println(getName()+" 等待 "+sleeper.getName()+"醒来中...");
            sleeper.join();
        } catch (InterruptedException e) {
            System.out.println("interrupted");
        }
        System.out.println(getName()+" 加入 "+sleeper.getName()+" 成功");
    }
}
public class Joining {
    public static void main(String[] args) {
        int sleeptime = 5000;
        Sleeper sleepy = new Sleeper("Sleepy", sleeptime),
                grumpy = new Sleeper("Grumpy", sleeptime);


        Joiner depey = new Joiner("Dopey", sleepy),
                doc = new Joiner("Doc", grumpy);

        grumpy.interrupt();//可以发现，如果睡觉的线程被中断了，那么加入的线程也会立即执行join加入该线程
    }
}
