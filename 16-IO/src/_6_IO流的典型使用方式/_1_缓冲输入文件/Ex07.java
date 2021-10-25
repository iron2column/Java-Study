package _6_IO流的典型使用方式._1_缓冲输入文件;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

/**
 * @author ChenMingYang
 * @date 2021-10-25 13:40
 */
public class Ex07 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("/Users/ironcolumn/Desktop/共产党宣言.txt");
        BufferedReader in = new BufferedReader(fileReader);
        String s;
        LinkedList<String> strings = new LinkedList<>();
        while ((s = in.readLine()) != null) {
            strings.addFirst(s);
        }
        in.close();

        for (String string : strings) {
            System.out.println(string);
        }
    }
}
