package _4;

import java.util.*;

/**
 * @Author ChenMingYang
 * @Date 2021-08-20 14:39
 */

public class New {
    public static <K, V> Map<K, V> map() {
        return new HashMap<K, V>();
    }

    public static <T> List<T> list() {
        return new ArrayList<T>();
    }

    public static <T> LinkedList<T> lList() {
        return new LinkedList<T>();
    }

    public static <T> Set<T> set() {
        return new HashSet<T>();
    }

    public static <T> Queue<T> queue() {
        return new LinkedList<T>();
    }

    public static void main(String[] args) {
        Map<String, List<String>> sls = New.map();
        System.out.println(sls);

        List<String> list = New.list();
        System.out.println(list);

        Set<String> set = New.set();
        System.out.println(set);

        Queue<String> queue = New.queue();
        System.out.println(queue);
    }

}
