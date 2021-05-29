import sun.jvm.hotspot.oops.Array;

import java.util.Arrays;

/**
 * @Author ChenMingYang
 * @Date 2021-05-28 14:48
 */

public class Ex03 {

    public static void main(String[] args) {
        int[] ints = new int[5];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = i;
        }
        System.out.println(Arrays.toString(ints));

        Integer[] integers = new Integer[4];
        for (int i = 0; i < integers.length; i++) {
            integers[i] = i;
        }
        for (int i = 0; i < integers.length; i++) {
            System.out.println(integers[i]);
        }
        System.out.println(integers);
        Ex01.main(new String[0]);
    }


}
