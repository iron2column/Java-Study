package _6._3;

import _6._2.CountingGenerator;

import java.util.Arrays;

/**
 * @Author ChenMingYang
 * @Date 2021-09-12 18:31
 */

public class Ex12 {
    public static void main(String[] args) {
        double[] d = new double[5];
        for (int i = 0; i < d.length; i++) {
            d[i] = new CountingGenerator.Double().next();
        }
        System.out.println("Arrays.toString(d) = " + Arrays.toString(d));
    }
}
