package _6_IO流的典型使用方式._2_从内存输入;

import _6_IO流的典型使用方式._1_缓冲输入文件.BufferedInputFile;

import java.io.IOException;
import java.io.StringReader;

/**
 * @author ChenMingYang
 * @date 2021-10-25 15:07
 */
public class FormattedMemoryInput {
    public static void main(String[] args) throws IOException {
        StringReader in = new StringReader(
                BufferedInputFile.read("/Users/ironcolumn/Desktop/宣言其一.txt")
        );

        int c;
        while ((c = in.read()) != -1) {
            System.out.println((char)c);
        }

    }
}
