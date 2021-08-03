import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * @Author ChenMingYang
 * @Date 2021-08-03 14:28
 */

public class SpiltDemo {

    static void refunc() {
        String input =
                "This!!unusual use!!of exclamation!!points";
        String[] split = input.split("!!");
        System.out.println(Arrays.toString(split));
        String[] split1 = input.split("!!", 3);
        System.out.println(Arrays.toString(split1));
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        refunc();
        System.out.println(System.currentTimeMillis()-start);
        System.out.println("===============");
        long start2 = System.currentTimeMillis();
        extracted();
        System.out.println(System.currentTimeMillis()-start2);
    }

    private static void extracted() {
        String input =
                "This!!unusual use!!of exclamation!!points";
        String s = Arrays.toString(Pattern.compile("!!").split(input));
        System.out.println(s);
        String s1 = Arrays.toString(Pattern.compile("!!").split(input, 3));
        System.out.println(s1);
    }
}
