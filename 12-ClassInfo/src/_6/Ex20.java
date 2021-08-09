package _6;

import java.lang.reflect.Method;

/**
 * @Author ChenMingYang
 * @Date 2021-08-09 12:56
 */

public class Ex20 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("没有输入命令行参数");
            System.exit(1);
        }
        String target = args[0];
        System.out.println("目标类："+target);
        try {
            Class<?> c = Class.forName(target);

            Method[] methods = c.getMethods();
            System.out.println("总计有方法： "+methods.length);

            for (Method method : methods) {
                System.out.println(method);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
