package _6._3;

import _6._2.CountingGenerator;

import java.util.Arrays;

/**
 * @Author ChenMingYang
 * @Date 2021-09-09 23:11
 */

public class PrimitiveConversionDemonstration {
    public static void main(String[] args) {
        Integer[] a =
                Generated.array(
                        Integer.class,
                        new CountingGenerator.Integer(),
                        15
                );
        int[] b = ConvertTo.primitive(a);

        System.out.println("Arrays.toString(b) = " + Arrays.toString(b));

        boolean[] c = ConvertTo.primitive(
                Generated.array(Boolean.class, new CountingGenerator.Boolean(), 7)
        );
        System.out.println("Arrays.toString(c) = " + Arrays.toString(c));
    }
}
