package _7._5;

import _6._2.RandomGenerator;
import _6._3.Generated;

import java.util.Arrays;

/**
 * @Author ChenMingYang
 * @Date 2021-09-17 13:46
 */

public class AlphabeticSearch {
    public static void main(String[] args) {
        String[] sa = Generated.array(new String[30], new RandomGenerator.String(5));

        Arrays.sort(sa, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Arrays.toString(sa) = " + Arrays.toString(sa));

        int index = Arrays.binarySearch(sa, sa[10], String.CASE_INSENSITIVE_ORDER);
        System.out.println("Index: "+index+"\n"+sa[index]);


    }
}
