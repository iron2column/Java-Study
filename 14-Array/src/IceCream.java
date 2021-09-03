import java.util.Arrays;
import java.util.Random;

/**
 * @Author ChenMingYang
 * @Date 2021-09-03 15:16
 */

public class IceCream {
    private static Random random = new Random();
    static final String[] FLAVORS = {
            "Chocolate", "Strawberry", "Vanilla Fudge Swirl",
            "Mint Chip", "Mocha Almond Fudge", "Rum Raisin",
            "Praline Cream","Mud Pie"
    };

    public static String[] flavorSet(int n) throws IllegalAccessException {
        if (n > FLAVORS.length) {
            throw new IllegalAccessException("Set too big");
        }
        String[] result = new String[n];
        boolean[] picked = new boolean[FLAVORS.length];
        for (int i = 0; i < n; i++) {
            int t;
            do {
                t = random.nextInt(FLAVORS.length);
            } while (picked[t]);
            result[i] = FLAVORS[t];
            picked[t] = true;//将已选数标记，确保不会被重复选择
        }
        return result;
    }

    public static void main(String[] args) throws IllegalAccessException {
        for (int i = 0; i < 7; i++) {
            System.out.println(Arrays.toString(flavorSet(3)));
        }
    }

}
