import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author ChenMingYang
 * @Date 2021-08-03 16:05
 */

public class Resetting {
    public static void main(String[] args) {
        Pattern compile = Pattern.compile("[frb][aiu][gx]");
        Matcher m = compile.matcher("fix the rug with bags");
        while (m.find()) {
            System.out.print(m.group() + " ");
        }
        System.out.println();
        m.reset("fix the rig with rags");
        while (m.find()) {
            System.out.print(m.group() + " ");
        }
    }
}
