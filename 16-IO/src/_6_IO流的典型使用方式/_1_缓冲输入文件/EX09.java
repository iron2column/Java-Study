package _6_IO流的典型使用方式._1_缓冲输入文件;

import java.io.*;
import java.util.ArrayList;

/**
 * @author ChenMingYang
 * @date 2021-10-25 14:08
 */
public class EX09 {

    private ArrayList<String> result = new ArrayList<>();

    private EX09() {
    }

    public static void main(String[] args) {
        try {
            ArrayList<String> result = EX09.getResult(args[0]);
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static ArrayList<String> getResult(String path) throws IOException {

        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(new File(path)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String s;
        ArrayList<String> result = new ArrayList<>();
        while ((s = in.readLine()) != null) {
            result.add(s.toUpperCase());
        }
        return result;
    }

}
