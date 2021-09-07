package _7._1;

import java.util.Arrays;

/**
 * @Author ChenMingYang
 * @Date 2021-09-07 15:12
 */

public class CopyingArrays {
    public static void main(String[] args) {
        int[] i = new int[7];
        int[] j = new int[10];

        Arrays.fill(i, 47);
        Arrays.fill(j, 99);

        System.out.println("i = " + Arrays.toString(i));
        System.out.println("j = " + Arrays.toString(j));

        System.arraycopy(i, 0, j, 0, i.length);
        System.out.println("Arrays.toString(j) = " + Arrays.toString(j));

        int[] k = new int[5];
        Arrays.fill(k, 103);
        System.arraycopy(i, 0, k, 0, k.length);
        System.out.println("Arrays.toString(k) = " + Arrays.toString(k));

        System.arraycopy(k, 0, i, 0, k.length);
        System.out.println("Arrays.toString(i) = " + Arrays.toString(i));

        //Objects:
        Integer[] u = new Integer[10];
        Integer[] v = new Integer[5];
        Arrays.fill(u, new Integer(47));
        Arrays.fill(v, 99);
        System.out.println("Arrays.toString(u) = " + Arrays.toString(u));
        System.out.println("Arrays.toString(v) = " + Arrays.toString(v));

        System.arraycopy(v, 0, u, u.length / 2, v.length);
        System.out.println("Arrays.toString(u) = " + Arrays.toString(u));
        System.out.println("Arrays.toString(v) = " + Arrays.toString(v));

    }
}
