package _7._2;

import java.util.Arrays;

/**
 * @Author ChenMingYang
 * @Date 2021-09-07 20:05
 */

public class Ex20 {
    public static void main(String[] args) {
        int[][] i3d1 = new int[2][2];
        int[][] i3d2 = new int[2][2];

        for (int i = 0; i < i3d1.length; i++) {
            for (int i1 = 0; i1 < i3d1[i].length; i1++) {
                i3d1[i][i1] = 2;
            }
        }
        for (int i = 0; i < i3d2.length; i++) {
            for (int i1 = 0; i1 < i3d2[i].length; i1++) {
                i3d2[i][i1] = 2;
            }
        }

        System.out.println("Arrays.deepEquals(i3d1,i3d2) = " + Arrays.deepEquals(i3d1, i3d2));
    }
}
