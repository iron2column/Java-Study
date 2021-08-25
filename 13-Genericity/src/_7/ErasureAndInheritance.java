package _7;

/**
 * @Author ChenMingYang
 * @Date 2021-08-25 12:48
 */

class GenericBase<T> {
    private T element;

    public void set(T arg) {
        //有点意思：传进来的类型反而被替换了
        arg = element;
    }

    public T get() {
        return element;
    }
}

class Derived1<T> extends GenericBase<T> {
}

class Derived2 extends GenericBase {
}

//class Derived3 extends GenericBase<?>{}
//奇怪的错误：
// 未期待类型：？
// 需要：无边界的类或接口

public class ErasureAndInheritance {
//    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Derived2 d2 = new Derived2();
        Object obj = d2.get();
        d2.set(obj);
    }
}
