package _7._2;

import java.util.Arrays;

/**
 * @Author ChenMingYang
 * @Date 2021-09-07 16:39
 */

public class ComparingArrays {
    public static void main(String[] args) {
        int[] a1 = new int[10];
        int[] a2 = new int[10];
        Arrays.fill(a1, 47);
        Arrays.fill(a2, 47);
        //第一层：引用是否相等
        //第二层：是否有null
        //第三层：先判断数量，然后逐个比较
        Arrays.equals(a1,a2);
        System.out.println(Arrays.equals(a1,a2));
        a2[3] = 11;
        System.out.println(Arrays.equals(a1,a2));

        String[] s1 = new String[4];
        Arrays.fill(s1, "Hi");
        String[] s2 = {
                new String("Hi"), new String("Hi"),
                new String("Hi"), new String("Hi")
        };
        System.out.println("Arrays.equals(s1, s2) = " + Arrays.equals(s1, s2));
    }

}
