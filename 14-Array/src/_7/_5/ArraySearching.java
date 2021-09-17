package _7._5;

import _3.generator.Generator;
import _6._2.RandomGenerator;
import _6._3.ConvertTo;
import _6._3.Generated;

import java.util.Arrays;

/**
 * @Author ChenMingYang
 * @Date 2021-09-17 13:23
 */

public class ArraySearching {
    public static void main(String[] args) {
        Generator<Integer> gen = new RandomGenerator.Integer(1000);
        int[] a = ConvertTo.primitive(Generated.array(new Integer[25], gen));
        Arrays.sort(a);
        System.out.println("Arrays.toString(a) = " + Arrays.toString(a));
        while (true) {
            int r = gen.next();
            int location = Arrays.binarySearch(a, r);
            if (location>=0) {
                System.out.println(r+" location=" + location);
                break;
            }
        }
    }
}
