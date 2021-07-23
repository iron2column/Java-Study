import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @Author ChenMingYang
 * @Date 2021-07-20 13:03
 */

public class Ex09 {
    public static void main(String[] args) {
        Random random = new Random(47);
        Set<Integer> integers = new HashSet<Integer>();

        for (int i = 0; i < 10000; i++) {
            int e = random.nextInt(30);
            System.out.println(e);
            integers.add(e);
        }
        //输出结果是有序的？为什么？Set不应该是无序的吗？
        System.out.println(integers);
    }
}
