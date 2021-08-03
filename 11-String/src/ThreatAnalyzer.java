import java.util.Scanner;
import java.util.regex.MatchResult;

/**
 * @Author ChenMingYang
 * @Date 2021-08-03 19:09
 */

public class ThreatAnalyzer {
    static String threatData =
            "59.27.82.161@02/10/2005\n"+
            "204.45.234.40@02/11/2005\n"+
            "58.21.82.161@02/11/2005\n"+
            "58.21.82.161@02/12/2005\n"+
            "58.21.82.161@02/12/2005\n"+
            "[Next log section with different data format]";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(threatData);
        String pattern = "(\\d+[.]\\d+[.]\\d+[.]\\d+)@(\\d{2}/\\d{2}/\\d{4})";
        while (scanner.hasNext(pattern)) {
            scanner.next(pattern);
            MatchResult match = scanner.match();
            String ip = match.group(1);
            String date = match.group(2);
            System.out.printf("Threat on %s from %s\n", date, ip);
        }
    }
}
