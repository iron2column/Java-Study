package _6._3;

import _6._2.CountingGenerator;

import java.util.Arrays;

/**
 * @Author ChenMingYang
 * @Date 2021-09-09 15:44
 */

public class TestGenerated {
    public static void main(String[] args) {
        Integer[] a = {9, 8, 7, 6};
        System.out.println("Arrays.toString(a) = " + Arrays.toString(a));

        Generated.array(a, new CountingGenerator.Integer());
        System.out.println("Arrays.toString(a) = " + Arrays.toString(a));
        //重写了a的内容，查看源码追究一下

        Integer[] b = Generated.array(Integer.class, new CountingGenerator.Integer(), 15);
        System.out.println("Arrays.toString(b) = " + Arrays.toString(b));
    }
}
