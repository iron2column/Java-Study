import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author ChenMingYang
 * @Date 2021-07-29 16:21
 */

public class Finding {
    public static void main(String[] args) {
        Matcher matcher = Pattern.compile("\\w+").matcher("Evening is full of linnet's wings");
        System.out.println("-------------");
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }
        System.out.println();
        System.out.println("-------------");
        int i = 0;
        while (matcher.find(i)) {
            System.out.println(matcher.group());
            i++;
        }
    }
}
