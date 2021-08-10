package _8;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collections;
import java.util.List;

/**
 * @Author ChenMingYang
 * @Date 2021-08-10 12:02
 */

class NullRobotProxyHandler implements InvocationHandler {
    private String nullName;

    //目标代理类——写在内部
    private class NRobot implements Null, Robot {
        public String name() {
            return nullName;
        }
        public String model() {
            return nullName;
        }
        public List<Operation> operations() {
            return Collections.emptyList();
        }
    }
    private Robot proxied = new NRobot();

    NullRobotProxyHandler(Class<? extends Robot> type) {
        nullName = type.getSimpleName() + " NullRobot";
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(proxied, args);
    }


}

/**
 * 此类应该是获取代理的类
 * 供客户端使用
 */
public class NullRobot {
    public static Robot newNullRobot(Class<? extends Robot> type) {
        return ((Robot) Proxy.newProxyInstance(
                NullRobot.class.getClassLoader(),
                //不能去掉Null.class:因为
                //不能去掉Robot.class:因为
                new Class[]{Null.class, Robot.class},
                new NullRobotProxyHandler(type)));
    }

    //做对比实验: 前提是相同类下 ——》 真实存在的对象 & 空对象
    public static void main(String[] args) {
        Robot[] robots = {
                //机器类型之1 ——》ShowRemovalRobot ——》真实对象
                new ShowRemovalRobot("SnowBee"),
                //机器类型之2 ——》ShowRemovalRobot ——》空对象
                NullRobot.newNullRobot(ShowRemovalRobot.class)
        };

        for (Robot bot : robots) {
            Robot.Test.test(bot);
        }
    }
}

