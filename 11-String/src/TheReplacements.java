import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author ChenMingYang
 * @Date 2021-08-03 14:55
 */
/*! Here's a block of text to use as input to\n" +
                        "the regular expression matcher. Note that we'll\n" +
                        "first extract delimiters, then process the\n" +
                        "extracted block. !*/
public class TheReplacements {


    public static void main(String[] args) {

        String s =
                "/*! Here's a block of text to use as input to\n" +
                        "the regular expression matcher. Note that we'll\n" +
                        "first extract delimiters, then process the\n" +
                        "extracted block. !*/";

        Pattern compile = Pattern.compile("/\\*!(.*)!\\*/", Pattern.DOTALL);
        Matcher mInput = compile.matcher(s);

        if (mInput.find()) {
            s = mInput.group(1);
            System.out.println(s);
        }
        s = s.replace(" {2,}", " ");
        System.out.println(s);
    }
}
