import java.util.Arrays;

/**
 * @Author ChenMingYang
 * @Date 2021-09-03 15:54
 */

public class ThreeDWithNew {
    public static void main(String[] args) {
        int[][][] a = new int[2][2][4];
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.deepToString(a));
        /*
        [[[I@29453f44, [[I@5cad8086]
        [[[0, 0, 0, 0], [0, 0, 0, 0]], [[0, 0, 0, 0], [0, 0, 0, 0]]]
         */
        System.out.println("a.length = " + a.length);


    }
}
