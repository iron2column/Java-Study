package _8._2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ChenMingYang
 * @Date 2021-08-26 15:54
 */

public class ListOfGenerics<T> {
    private List<T> array = new ArrayList<T>();

    public void add(T item) {
        array.add(item);
    }

    public T get(int index) {
        return array.get(index);
    }
}
