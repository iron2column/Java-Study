package _8;

import java.lang.reflect.Constructor;

/**
 * @Author ChenMingYang
 * @Date 2021-08-26 14:43
 */
class SomeClass {
    private int anInt;

    public SomeClass(int anInt) {
        this.anInt = anInt;
    }
}


public class Ex22<T> {

    public static void main(String[] args) throws Exception {
        Ex22<SomeClass> someClassEx22 = new Ex22<>();
        SomeClass someClass = someClassEx22.create(SomeClass.class);

    }

    public T create(Class<T> kind) throws Exception {

        Constructor<T> constructor = kind.getConstructor(int.class);
        T t = constructor.newInstance(2);
        return t;

    }

}
