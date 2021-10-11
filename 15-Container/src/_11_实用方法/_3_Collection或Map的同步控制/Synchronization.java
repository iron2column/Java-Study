package _11_实用方法._3_Collection或Map的同步控制;

import java.util.*;

/**
 * @Author ChenMingYang
 * @Date 2021-10-11 20:10
 */

public class Synchronization {
    public static void main(String[] args) {
        Collection<String> c = Collections.synchronizedCollection(new ArrayList<String>());

        List<String> list = Collections.synchronizedList(new ArrayList<String>());

        Set<String> s = Collections.synchronizedSet(new HashSet<String>());

        Set<String> ss = Collections.synchronizedSortedSet(new TreeSet<String>());

        //...

    }
}
