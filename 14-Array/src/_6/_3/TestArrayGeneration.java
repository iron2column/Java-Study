package _6._3;

import _6._2.RandomGenerator;

import java.util.Arrays;

/**
 * @Author ChenMingYang
 * @Date 2021-09-12 17:56
 */

public class TestArrayGeneration {
    public static void main(String[] args) {
        int size = 6;
        boolean[] a1 =
                ConvertTo.primitive(
                        Generated.array(
                                Boolean.class,
                                new RandomGenerator.Boolean(),
                                size
                        )
                );
        System.out.println("Arrays.toString(a1) = " + Arrays.toString(a1));

        byte[] a2 = ConvertTo.primitive(Generated.array(Byte.class, new RandomGenerator.Byte(), size));
        System.out.println("Arrays.toString(a2) = " + Arrays.toString(a2));

        char[] a3 = ConvertTo.primitive(Generated.array(
                Character.class, new RandomGenerator.Character(), size
        ));
        System.out.println("Arrays.toString(a3) = " + Arrays.toString(a3));

        //……
    }
}
