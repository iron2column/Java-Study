package _2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ChenMingYang
 * @Date 2021-08-06 16:31
 */
class CountedInteger {
    private static long counter;
    private final long id = counter++;
    private int a = 1;

    public String toString() {
        return Long.toString(id);
    }
    //必须保持一个默认无参构造器
    public CountedInteger() {
    }

    public CountedInteger(int nu) {
        this.a = nu;
    }
}

public class FilledList<T> {
    private Class<T> type;

    public FilledList(Class<T> type) {
        this.type = type;
    }

    public List<T> create(int nElement) {
        ArrayList<T> result = new ArrayList<>();
        try {
            for (int i = 0; i < nElement; i++) {
                //newInstance必须调用无参构造器，编译不会报错，运行时爆难以追查
                result.add(type.newInstance());
            }
        } catch (Exception e) {
            throw new RuntimeException();
        }
        return result;
    }

    public static void main(String[] args) {
        FilledList<CountedInteger> fl = new FilledList<CountedInteger>(CountedInteger.class);
        List<CountedInteger> x = fl.create(15);
        System.out.println(x);
    }
}
