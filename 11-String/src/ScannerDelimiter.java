import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @Author ChenMingYang
 * @Date 2021-08-03 18:10
 */

public class ScannerDelimiter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("12, 42, 78, 99, 42");
        scanner.useDelimiter("\\s*,\\s*");
        while (scanner.hasNext()) {
            System.out.println(scanner.nextInt());
        }

        Pattern delimiter = scanner.delimiter();
    }
}
