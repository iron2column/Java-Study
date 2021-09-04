import java.util.Arrays;

/**
 * @Author ChenMingYang
 * @Date 2021-09-03 15:42
 */

public class MultidimensionalPrimitiveArray {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {},
                {7,8},
        };
        System.out.println("Arrays.deepToString(a) = " + Arrays.deepToString(a));
        System.out.println("Arrays.toString(a) = " + Arrays.toString(a));
        /*
        Arrays.deepToString(a) = [[1, 2, 3], [4, 5, 6]]
        Arrays.toString(a) = [[I@5cad8086, [I@6e0be858]
         */
    }

}
