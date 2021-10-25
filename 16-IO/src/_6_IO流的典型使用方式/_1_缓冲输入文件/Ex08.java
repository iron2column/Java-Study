package _6_IO流的典型使用方式._1_缓冲输入文件;

import java.io.*;
import java.util.LinkedList;

/**
 * @author ChenMingYang
 * @date 2021-10-25 13:46
 */
public class Ex08 {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.println("没有提供参数");
            System.exit(1);
        }
        File file = new File(args[0]);
        FileReader fileReader = null;
        if (file.exists() && file.isFile()) {
            fileReader = new FileReader(file);
        } else {
            System.out.println("文件不存在或目标不是文件而是目录");
            System.exit(1);
        }
        BufferedReader in = new BufferedReader(fileReader);
        String s;
        LinkedList<String> strings = new LinkedList<>();
        while ((s = in.readLine()) != null) {
            strings.add(s);
        }
        for (String string : strings) {
            System.out.println(string);
        }


    }
}
