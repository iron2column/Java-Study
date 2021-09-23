package _3_Collection功能;

import _2_填充容器._3_Abstract类.Countries;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @Author ChenMingYang
 * @Date 2021-09-20 11:32
 */

public class CollectionMethods {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.addAll(Countries.names(6));
        c.add("ten");
        c.add("eleven");
        System.out.println("c = " + c);

        /*
        集合容器转换为数组容器
         */
        Object[] array = c.toArray();//make an array from the List
        String[] str = c.toArray(new String[0]);//make a String array from List

        /*
        寻找最大最小元素：这意味着不同的事物取决于Comparable接口的不同实现
         */
        System.out.println("Collections.max(c) = " + Collections.max(c));
        System.out.println("Collections.min(c) = " + Collections.min(c) + "\n");

        Collection<String> c2 = new ArrayList<>();
        c2.addAll(Countries.names(6));
        c.addAll(c2);
        /*
        删除元素的方法
         */
        System.out.println(c.size() + " c = " + c);
        System.out.println("remove first one of " + Countries.DATA[0][0]);
        c.remove(Countries.DATA[0][0]);
        System.out.println(c.size() + " c = " + c);
        System.out.println("remove first one of " + Countries.DATA[1][0]);
        c.remove(Countries.DATA[1][0]);
        System.out.println(c.size() + " c = " + c);
        //remove all components that are in the argument collection
        c.removeAll(c2);
        System.out.println("remove all of " + c2);
        System.out.println(c.size() + " c = " + c + "\n");

        /*
        元素包含与否
         */
        c.addAll(c2);
        System.out.println("c = " + c);
        String var = Countries.DATA[3][0];
        System.out.println("c.contains(" + var + ") = " + c.contains(var));
        System.out.println("c.containsAll(" + c2 + ") = " + c.containsAll(c2) + '\n');

        Collection<String> c3 = ((List<String>) c).subList(3, 5);
        System.out.println("c3 = " + c3);
        System.out.println("c2 = " + c2 + "\n--------");
        /*
        仅保留指定元素，也就是去掉没有指定的
         */
        System.out.println(c2 + ".retainAll(" + c3 + ") ");
        c2.retainAll(c3);
        System.out.println("c2 = " + c2);

        System.out.println(c2 + ".removeAll(" + c3 + ")");
        c2.removeAll(c3);
        System.out.println("c2 = " + c2);
    }
}
