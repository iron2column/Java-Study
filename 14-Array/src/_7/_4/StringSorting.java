package _7._4;

import _6._2.RandomGenerator;
import _6._3.Generated;

import java.util.Arrays;
import java.util.Collections;

/**
 * @Author ChenMingYang
 * @Date 2021-09-17 13:07
 */

public class StringSorting {
    public static void main(String[] args) {
        String[] sa = Generated.array(new String[20], new RandomGenerator.String(5));
        System.out.println("Before sort ==> Arrays.toString(sa) = " + Arrays.toString(sa));

        Arrays.sort(sa);

        System.out.println("After sort ==> Arrays.toString(sa) = " + Arrays.toString(sa));

        Arrays.sort(sa, Collections.reverseOrder());

        System.out.println("反序 ==> Arrays.toString(sa) = " + Arrays.toString(sa));

        Arrays.sort(sa, String.CASE_INSENSITIVE_ORDER);

        System.out.println("大小写不敏感 ==> Arrays.toString(sa) = " + Arrays.toString(sa));
    }
}
