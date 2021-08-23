package _7;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Date;

/**
 * @Author ChenMingYang
 * @Date 2021-08-09 14:41
 */
class DynamicProxyHandler implements InvocationHandler {
    private Object proxied;

    public DynamicProxyHandler() {
    }

    public DynamicProxyHandler(Object proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //timeLog(proxy, method, args);
        //System.out.println(proxy);
        return method.invoke(proxied, args);
    }

    private void timeLog(Object proxy, Method method, Object[] args) {
        long timeIn = new Date().getTime();
        System.out.println("**** proxy: " + proxy.getClass() +
                ", method: " + method + ", args: " + args +
                ", invoked at " + timeIn + " on " + (new Date()));
        if(args != null) {
            for(Object arg : args) {
                System.out.println("  " + args);
            }
        }
        long timeOut = new Date().getTime();
        System.out.println("Method call-return time: " + (timeOut - timeIn) + " msecs");
    }
}

public class SimpleDynamicProxy {
    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        System.out.println("客户端直接调用：");
        RealObject real = new RealObject();
        consumer(real);
        System.out.println("\n");


        Interface proxy = (Interface) Proxy.newProxyInstance(
                Interface.class.getClassLoader(),
                new Class[]{Interface.class},
                new DynamicProxyHandler(real)
        );
        consumer(proxy);


    }

}
