package _6._3;

import java.util.Arrays;

/**
 * @Author ChenMingYang
 * @Date 2021-09-12 18:07
 */

public class Ex11 {
    public static void main(String[] args) {
        int[] ia = new int[2];
        //show(ia);
        ia[0] = new Integer(1);
        //show(ia);
        ia[0] = new Integer(2);
        //show(ia);
        System.out.println(ia.getClass().getName());


        Integer[] Ia = new Integer[2];
        Ia[0] = ((int) 1);
        Ia[1] = ((int) 2);
        System.out.println(Ia.getClass().getName());
        System.out.println(Ia[0] instanceof Integer);//证明强制为int是无效的

        for (int i = 0; i < Ia.length; i++) {
            System.out.println(Ia[i].getClass().getName());
        }

        //!ia = Ia;
        //!Ia = ia;
    }

    static void show(int[] arr) {
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }
}
