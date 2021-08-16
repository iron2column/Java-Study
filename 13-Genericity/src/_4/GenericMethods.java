package _4;

/**
 * @Author ChenMingYang
 * @Date 2021-08-16 15:03
 */

public class GenericMethods {
    public <T> void f(T x,T y,T z) {
        System.out.println(x.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethods genericMethods = new GenericMethods();
        genericMethods.f(" ", 1, 2.0f);

    }
}
