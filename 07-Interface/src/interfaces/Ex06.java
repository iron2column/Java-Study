package interfaces;

import sun.security.util.ArrayUtil;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.*;

/**
 * @Author ChenMingYang
 * @Date 2021-06-18 12:24
 */
class RandomWords implements Readable {

    //随机数种子
    private static Random rand = new Random(47);
    //大写字符数组
    private static final char[] capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    //小写字符数组
    private static final char[] lowers = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    //元音字符数组
    private static final char[] vowels = "aeiou".toCharArray();

    private int count;

    public RandomWords(int count) {
        this.count = count;
    }


    @Override
    public int read(CharBuffer cb) throws IOException {
        if (count-- == 0) {
            return -1;
        }
        cb.append(capitals[rand.nextInt(capitals.length)]);
        for (int i = 0; i < 4; i++) {
            cb.append(vowels[rand.nextInt(vowels.length)]);
            cb.append(lowers[rand.nextInt(lowers.length)]);
        }
        cb.append(" ");
        return 10;
    }




}
public class Ex06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(new RandomWords(3));
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }


    }
}
