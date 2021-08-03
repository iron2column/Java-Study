import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author ChenMingYang
 * @Date 2021-07-29 14:10
 */

public class TestRegularExpression {
    public static void demo() {
        Pattern pattern = Pattern.compile("ll");
        Matcher matcher = pattern.matcher("hello space");
        boolean matches = matcher.matches();
        System.out.println(matches);
    }

    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println(arg);
        }
        if (args.length < 2) {
            System.out.println("Usage:\njava TestRegularExpression " +
                    "characterSequence regularExpression+");
            System.exit(0);
        }
        System.out.println("Input: \"" + args[0] + "\"\n");
        for (String arg : args) {
            System.out.println("Regular expression: \"" + arg + "\"");
            Pattern pattern = Pattern.compile(arg);
            Matcher matcher = pattern.matcher(args[0]);
            while (matcher.find()) {
                System.out.println("Match \"" + matcher.group() + "\" at positions " + matcher.start() + "-" + (matcher.end() - 1));
            }
            System.out.println();
        }
    }
}
