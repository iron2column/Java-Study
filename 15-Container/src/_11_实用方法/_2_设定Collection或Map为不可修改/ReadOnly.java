package _11_实用方法._2_设定Collection或Map为不可修改;

import _2_填充容器._3_Abstract类.Countries;

import java.util.*;

/**
 * @Author ChenMingYang
 * @Date 2021-10-11 17:35
 */

public class ReadOnly {
    static Collection<String> data = new ArrayList<String>(Countries.names(6));

    public static void main(String[] args) {
        Collection<String> c = Collections.unmodifiableCollection(new ArrayList<String>(data));
        System.out.println(c);
        //!c.add("one");

        List<String> a = Collections.unmodifiableList(new ArrayList<String>(data));
        ListIterator<String> lit = a.listIterator();
        System.out.println(lit.next());
        //!lit.add("one");


    }
}
