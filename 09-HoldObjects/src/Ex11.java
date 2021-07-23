import java.util.HashMap;
import java.util.Random;

/**
 * @Author ChenMingYang
 * @Date 2021-07-22 13:52
 */

public class Ex11 {
    public static void main(String[] args) {
        Random random = new Random(47);

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            int anInt = random.nextInt(20);

            Integer frequency = map.get(anInt);

            map.put(anInt, frequency == null ? 1 : frequency + 1);
        }
        System.out.println("map = " + map);

        Integer integer = new Integer(717);

        System.out.println(integer);

    }

}
