package _7._1;

import java.util.Arrays;

/**
 * @Author ChenMingYang
 * @Date 2021-09-07 15:54
 */

public class Ex18 {
    public static void main(String[] args) {
        BerylliumSphere[] bs = new BerylliumSphere[10];
        Arrays.fill(bs,new BerylliumSphere());
        System.out.println("Arrays.toString(bs) = " + Arrays.toString(bs));

        BerylliumSphere[] bs1 = new BerylliumSphere[10];
        for (int i = 0; i < bs1.length; i++) {
            bs1[i] = new BerylliumSphere();
        }
        System.out.println("Arrays.toString(bs1) = " + Arrays.toString(bs1));

        System.out.println();
        System.arraycopy(bs1, 0, bs, 0, bs.length);
        System.out.println("Arrays.toString(bs) = " + Arrays.toString(bs));
        System.out.println("Arrays.toString(bs1) = " + Arrays.toString(bs1));
    }
}
