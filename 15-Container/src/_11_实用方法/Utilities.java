package _11_实用方法;

import java.util.*;

/**
 * @Author ChenMingYang
 * @Date 2021-10-08 14:44
 */

public class Utilities {
    static List<String> list = Arrays.asList("one Two three Four five six one".split(" "));

    public static void main(String[] args) {
        System.out.println(list);
        System.out.println("list 是否包含 four（four以列表的形式传递): " +
                Collections.disjoint(list, Collections.singletonList("four")));

        System.out.println();
        System.out.println("list中最大值: " + Collections.max(list));
        System.out.println("list中最小值: " + Collections.min(list));
        System.out.println();

        System.out.println("");

        System.out.println("max w/ comparator: " + Collections.max(list, String.CASE_INSENSITIVE_ORDER));
        System.out.println("min w/ comparator: " + Collections.min(list, String.CASE_INSENSITIVE_ORDER));

        System.out.println();

        List<String> sublist = Arrays.asList("Four five six".split(" "));
        System.out.println("indexOfSublist: " + Collections.indexOfSubList(list, sublist));
        System.out.println("lastIndexOf: " + Collections.lastIndexOfSubList(list, sublist));

        Collections.replaceAll(list, "one", "Yo");

        System.out.println();

        System.out.println("replaceAll: " + list);

        System.out.println();

        Collections.reverse(list);
        System.out.println("reverse: " + list);

        System.out.println();

        Collections.rotate(list, 3);
        System.out.println("rotate 3: " + list);

        System.out.println();

        List<String> source = Arrays.asList("in the matrix".split(" "));
        Collections.copy(list, source);
        System.out.println("copy: " + list);

        System.out.println();

        Collections.swap(list, 0, list.size() - 1);
        System.out.println("swap: "+list);

        System.out.println();

        Collections.shuffle(list, new Random(47));
        System.out.println("shuffle: " + list);

        System.out.println();

        Collections.fill(list, "pop");
        System.out.println("fill: " + list);

        System.out.println();

        System.out.println("frequency of pop: " + Collections.frequency(list, "pop"));

        System.out.println();

        List<String> dups = Collections.nCopies(3, "snap");
        System.out.println("dups = " + dups);

        System.out.println();

        System.out.println("list is dis joint dups: " + Collections.disjoint(list, dups));

        System.out.println();

        Enumeration<String> e = Collections.enumeration(dups);
        Vector<String> v = new Vector<>();
        while (e.hasMoreElements()) {
            v.addElement(e.nextElement());
        }
        ArrayList<String> arrayList = Collections.list(v.elements());
        System.out.println("arrayList = " + arrayList);

        System.out.println();
    }
}
