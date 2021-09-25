package _4_可选操作._1_尾货支持的操作;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @Author ChenMingYang
 * @Date 2021-09-24 15:10
 */

public class Unsupported {
    static void test(String msg, List<String> list) {
        System.out.println("----" + msg + "----");
        Collection<String> c = list;
        Collection<String> subList = list.subList(1, 8);

        Collection<String> c2 = new ArrayList<>(subList);

        System.out.println("c = " + c);
        System.out.println("subList = " + subList);
        System.out.println("c2 = " + c2);

        try {
            c.retainAll(c2);
        } catch (Exception e) {
            System.out.println("retainAll " + e);
        }

        try {
            c.removeAll(c2);
        } catch (Exception e) {
            System.out.println("removeAll " + e);
        }

        try {
            c.clear();
        } catch (Exception e) {
            System.out.println("clear " + e);
        }

        try {
            c.add("X");
        } catch (Exception e) {
            System.out.println("add " + e);
        }

        try {
            c.addAll(c2);
        } catch (Exception e) {
            System.out.println("addAll " + e);
        }

        try {
            c.remove("C");
        } catch (Exception e) {
            System.out.println("remove " + e);
        }

        try {
            list.set(0, "X");
        } catch (Exception e) {
            System.out.println("List.set " + e);
        }
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("A B C D E F G H I J K L".split(" "));
        test("Modifiable Copy",new ArrayList<String>(list));
        test("Array.asList()", list);
    }
}
