package _7;

import _6._2.RandomGenerator;
import _6._3.Generated;

import java.util.Arrays;
import java.util.Collections;

/**
 * @Author ChenMingYang
 * @Date 2021-09-17 13:54
 */

public class Ex22_23 {
    public static void main(String[] args) {
        Integer[] a = Generated.array(new Integer[12], new RandomGenerator.Integer(1000));
        System.out.println("Arrays.toString(a) = " + Arrays.toString(a));

        int i = Arrays.binarySearch(a, a[4]);
        System.out.println("i = " + i);

        Arrays.sort(a, Collections.reverseOrder());
        System.out.println("Arrays.toString(a) = " + Arrays.toString(a));
    }
}
