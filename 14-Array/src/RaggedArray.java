import java.util.Arrays;
import java.util.Random;

/**
 * @Author ChenMingYang
 * @Date 2021-09-03 18:05
 */

public class RaggedArray {
    public static void main(String[] args) {
        Random random = new Random(47);
        //3d array with variable length
        int[][][] a = new int[random.nextInt(7)][][];
        for (int i = 0; i < a.length; i++) {
            a[i] = new int[random.nextInt(5)][];
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = new int[random.nextInt(5)];
            }
        }
        System.out.println(Arrays.deepToString(a));
    }
}
