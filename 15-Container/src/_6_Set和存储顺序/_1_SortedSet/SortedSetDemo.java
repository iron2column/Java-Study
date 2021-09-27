package _6_Set和存储顺序._1_SortedSet;

import java.util.Collections;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @Author ChenMingYang
 * @Date 2021-09-26 23:14
 */

public class SortedSetDemo {
    public static void main(String[] args) {
        SortedSet<String> sortedSet = new TreeSet<>();
        Collections.addAll(sortedSet, "one two three four five six seven eight".split(" "));
        System.out.println(sortedSet);

        String first = sortedSet.first();
        System.out.println("first = " + first);
        String last = sortedSet.last();
        System.out.println("last = " + last);

        Iterator<String> it = sortedSet.iterator();
        for (int i = 0; i <= 6; i++) {
            if (i==3) {
                first = it.next();
            }
            if (i == 6) {
                last = it.next();
            } else {
                it.next();
            }
        }
        System.out.println("first = " + first);
        System.out.println("last = " + last);

        System.out.println(sortedSet.subSet(first, last));
        System.out.println(sortedSet.headSet(last));
        System.out.println(sortedSet.tailSet(first));
    }
}
