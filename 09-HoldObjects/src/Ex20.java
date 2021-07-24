import java.util.Arrays;

/**
 * @Author ChenMingYang
 * @Date 2021-07-23 22:16
 */

public class Ex20 {
    static <T> void test(Iterable<T> ib) {
        for (T t : ib) {
            System.out.print(t+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //foreach一个List
        // 这没问题
        test(Arrays.asList(1,2,3));

        String[] strings = {"A", "B", "C"};

        //foreach一个数组
        // 这也没问题
        for (String string : strings) {
            System.out.print(string+" ");
        }
        System.out.println();

        //数组不能自动包装为Iterable
        //!test(strings);

        //手动包装一下
        test(Arrays.asList(strings));
    }
}
