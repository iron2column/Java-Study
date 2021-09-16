package _7._3;

import _6._3.Generated;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author ChenMingYang
 * @Date 2021-09-16 15:44
 */

public class Reverse {
    public static void main(String[] args) {
        CompType[] a = Generated.array(new CompType[12], CompType.generator());
        System.out.println("Arrays.toString(a) = " + Arrays.toString(a));
        Arrays.sort(a, Comparator.reverseOrder());
        System.out.println("Arrays.toString(a) = " + Arrays.toString(a));
    }
}
