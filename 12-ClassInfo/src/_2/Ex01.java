package _2;

import java.lang.reflect.Field;

/**
 * @Author ChenMingYang
 * @Date 2021-08-04 17:24
 */
class S {
    private String name;
}

class D extends S {
    private int anInt;
}
public class Ex01 {
    static void allInherit(Class tar) {
        if (tar==null) {
            System.out.print("null");
            System.out.println();
            return;
        }



        System.out.print(tar.getSimpleName()+"-->");

        allInherit(tar.getSuperclass());

        Field[] declaredFields = tar.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
    }

    public static void main(String[] args) {
        allInherit(new D().getClass());

    }
}
