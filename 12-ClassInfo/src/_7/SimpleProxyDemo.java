package _7;

import java.util.Date;

/**
 * @Author ChenMingYang
 * @Date 2021-08-09 13:44
 */

interface Interface {
    void doSomething();

    void somethingElse(String arg);
}

class RealObject implements Interface {
    @Override
    public void doSomething() {
        System.out.println("do something");
    }

    @Override
    public void somethingElse(String arg) {
        System.out.println("somethingElse " + arg);
    }
}

class SimpleProxy implements Interface {
    public static int count_1;
    public static int count_2;
    private Interface proxied;

    public SimpleProxy(Interface proxied) {
        this.proxied = proxied;
    }

    @Override
    public void doSomething() {
        long time = new Date().getTime();
        System.out.println("Time called doSomething() " + count_1 + " times: " + time + " msecs");
        proxied.doSomething();
        count_1++;
        System.out.println("Call-return time = " + (new Date().getTime() - time) + " msecs");
    }

    @Override
    public void somethingElse(String arg) {
        long time = new Date().getTime();
        System.out.println("Time called doSomething() " + count_2 + " times: " + time + " msecs");
        proxied.somethingElse(arg);
        count_2++;
        System.out.println("Call-return time = " + (new Date().getTime() - time) + " msecs");

    }
}

public class SimpleProxyDemo {

    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        System.out.println("我是客户");
        consumer(new RealObject());
        System.out.println("\n");


        System.out.println("我是代理");
        consumer(new SimpleProxy(new RealObject()));
        System.out.println();
        consumer(new SimpleProxy(new RealObject()));
        System.out.println();
        consumer(new SimpleProxy(new RealObject()));
        System.out.println();


    }
}
