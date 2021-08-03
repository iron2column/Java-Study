import java.io.File;
import java.io.IOException;

/**
 * @Author ChenMingYang
 * @Date 2021-07-26 18:31
 */

public class Hex {
    public static String format(byte[] data) {
        StringBuilder result = new StringBuilder();
        int n = 0;
        for (byte b : data) {
            if (n % 16 == 0) {
                result.append(String.format("%05X: ", n));
            }
            result.append(String.format("%02X", b));
            n++;
            if (n%16==0) {
                result.append("\n");
            }
        }
        result.append("\n");
        return result.toString();
    }

    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.println(
                    format(BinaryFile.read("/Users/ironcolumn/IdeaProjects/Java-Study/out/production/11-String/Hex.class"))
            );
        } else {
            System.out.println(
                    format(BinaryFile.read(new File(args[0])))
            );
        }
    }
}
