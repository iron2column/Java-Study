package _1_File类._2_目录实用工具;

import java.io.File;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

/**
 * @author ChenMingYang
 * @date 2021-10-18 13:21
 */
public class Ex4 {
    public static String humanReadableByteCountSI(long bytes) {
        if (-1000 < bytes && bytes < 1000) {
            return bytes + " B";
        }
        CharacterIterator ci = new StringCharacterIterator("kMGTPE");
        while (bytes <= -999_950 || bytes >= 999_950) {
            bytes /= 1000;
            ci.next();
        }
        return String.format("%.1f %cB", bytes / 1000.0, ci.current());
    }
    public static void main(String[] args) {
        Directory.TreeInfo walk = Directory.walk(".", ".*\\.java");
        long sum = 0;
        for (File file : walk) {
            System.out.println(file.length());
            sum += file.length();
        }
        System.out.println("======\n"+humanReadableByteCountSI(sum));

    }
}
