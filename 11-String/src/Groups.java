import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author ChenMingYang
 * @Date 2021-08-03 01:45
 */

public class Groups {
    static public final String POEM =
            "Twas brillig, and the slithy toves\n" +
            "Did gyre and gimble in the wabe.\n" +
            "All mimsy were the borogoves,\n"+
            "And the mome raths outgrabe.\n"+
            "Beware the Jaberwock, my son.\n"+
            "The Jaws that bite, the claws that catch.\n"+
            "Beware the Jubjub bird, and shun]\n"+
            "The frumious Bandersnatch.";

    public static void main(String[] args) {

        Matcher matcher = Pattern.compile("[A-Z]\\S+").matcher(POEM);
        while (matcher.find()) {
            for (int i = 0; i < matcher.groupCount(); i++) {
                System.out.print("["+matcher.group(i)+"]");
            }
        }
    }

    private static void extracted() {
        Matcher m = Pattern.compile("(?m)(\\S+)\\s+((\\S+)\\s+(\\S+))$").matcher(POEM);

        while (m.find()) {
            for (int i = 0; i < m.groupCount(); i++) {
                System.out.print("["+m.group(i)+"]");
            }
            System.out.println();
        }
    }

}
