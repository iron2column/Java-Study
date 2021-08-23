package _4._2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author ChenMingYang
 * @Date 2021-08-20 15:04
 */

public class GenericVarargs {
    public static <T> List<T> makeList(T... args) {
        List<T> result = new ArrayList<>();
        for (T item : args) {
            result.add(item);
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> ls = makeList("A");
        System.out.println(ls);

        ls = makeList("A", "C");
        System.out.println(ls);

        List<? extends Serializable> list = makeList("A", 2.0f, "C");
        System.out.println(list);
    }
}
