package _11_实用方法._1_List的排序和查询;

import _11_实用方法.Utilities;

import java.util.*;

/**
 * @Author ChenMingYang
 * @Date 2021-10-11 17:20
 */

public class ListSortSearch {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Utilities.list);

        list.addAll(Utilities.list);
        System.out.println(list);

        Collections.shuffle(list, new Random(47));

        System.out.println("shuffle: "+list);

        ListIterator<String> it = list.listIterator(10);

        while (it.hasNext()) {
            it.next();
            it.remove();
        }
        System.out.println("Trimmed: " + list);

        Collections.sort(list);
        System.out.println("sorted: " + list);

        String key = list.get(7);
        int index = Collections.binarySearch(list, key);

        Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
        System.out.println(list);


    }
}
