import java.util.Arrays;
import java.util.Random;

/**
 * @Author ChenMingYang
 * @Date 2021-09-03 18:40
 */

public class Ex3 {
    static double[][] initDouble(int i, int j) {
        Random random = new Random(47);

        int smell = i < j ? i : j;
        int big = i + j - smell;

        double[][] result = new double[smell][big];
        for (int i1 = 0; i1 < result.length; i1++) {
            for (int i2 = 0; i2 < result[i1].length; i2++) {
                double v = random.nextDouble() * (big - smell) + smell;
                result[i1][i2] = v;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        double[][] doubles = initDouble(3, 4);
        System.out.println(Arrays.deepToString(doubles));
    }
}
