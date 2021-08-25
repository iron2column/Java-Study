package _7;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ChenMingYang
 * @Date 2021-08-25 14:07
 */

public class ListMaker<T> {
    List<T> create() {
        return new ArrayList<T>();
    }

    public static void main(String[] args) {
        ListMaker<String> stringListMaker = new ListMaker<String>();

        List<String> strings = stringListMaker.create();
    }
}
