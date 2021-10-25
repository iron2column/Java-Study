package _6_IO流的典型使用方式._1_缓冲输入文件;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author ChenMingYang
 * @date 2021-10-25 11:48
 */
public class BufferedInputFile {

    public static String read(String Filename) throws IOException {
        //将file文件路径读取成FileReader对象
        //主要是为了获取文件对象还能读写
        FileReader file = new FileReader(Filename);

        //使用BufferedReader是为了提高速度
        BufferedReader in = new BufferedReader(file);
        
        String s;
        StringBuilder sb = new StringBuilder();
        while ((s = in.readLine()) != null) {
            sb.append(s + "\n");
        }
        in.close();

        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        System.out.println(read("/Users/ironcolumn/project/projectsIdea/Java-Study/16-IO/src/_6_IO流的典型使用方式/_1_缓冲输入文件/BufferedInputFile.java"));
    }
}
