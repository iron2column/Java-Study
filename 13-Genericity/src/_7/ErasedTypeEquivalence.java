package _7;

import java.util.ArrayList;

/**
 * @Author ChenMingYang
 * @Date 2021-08-25 10:13
 */

public class ErasedTypeEquivalence {
    public static void main(String[] args) {
        Class c1 = new ArrayList<String>().getClass();
        Class c2 = new ArrayList<Integer>().getClass();
        if (c1==c2) {
            System.out.println(c1);
            System.out.println(c2);
            System.out.println("true");
        }
    }
}
