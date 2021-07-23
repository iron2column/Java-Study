import java.util.PriorityQueue;
import java.util.Random;

/**
 * @Author ChenMingYang
 * @Date 2021-07-23 17:00
 */

public class Ex15 {
    public static void main(String[] args) {
        Random random = new Random(47);

        PriorityQueue<Integer> integers = new PriorityQueue<>();

        for (int i = 0; i < 10; i++) {
            integers.offer(i + random.nextInt(10));
        }


        while (integers.peek() != null) {
            System.out.print(integers.poll()+" ");
        }

    }
}
