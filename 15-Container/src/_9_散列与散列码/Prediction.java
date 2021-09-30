package _9_散列与散列码;

import java.util.Random;

/**
 * @Author ChenMingYang
 * @Date 2021-09-29 14:42
 */

public class Prediction {
    private static Random random = new Random(47);
    private boolean shadow = random.nextDouble() > 0.5;

    @Override
    public String toString() {
        if (shadow) {
            return "Six more weeks of Winter";
        } else {
            return "Early Spring";
        }
    }
}
