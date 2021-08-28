package _8;

/**
 * @Author ChenMingYang
 * @Date 2021-08-26 10:48
 */

/**
 * 关于擦除带来的影响：<br>无法为「在运行时需要确切类型信息的操作」工作
 *  <li>无法——>进行类型判断: arg instanceof T ——>样例{@link ClassTypeCapture}</li>
 *  <li>无法——>进行直接实例化 ——>失败样例{@link ClassAsFactory} ——>更好的样例{@link FactoryConstraint}</li>
 *  <li></li>
 * @param <T>
 */
public class Erased<T> {

    private final int SIZE = 100;

    public static void f(Object arg) {
        //if (arg instanceof T) {}
        //T var = new T();
        //T[] array = new T[];
        //T[] array = new Object[SIZE];
    }
}
