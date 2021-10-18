package _1_File类._1_目录列表器;

import java.io.File;

/**
 * @Author ChenMingYang
 * @Date 2021-10-13 16:03
 */
class SortedDirList {
    private File path;

    public SortedDirList(String pathString) {
        path = new File(pathString);
    }

    public void getFiles() {

    }

}
public class Ex2 {
    public static void main(String[] args) {
        SortedDirList sd = new SortedDirList(".");
        sd.getFiles();
    }

}
