package _8_理解Map;

import net.mindview.util.TextFile;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Author ChenMingYang
 * @Date 2021-09-28 10:52
 */

public class Ex13 {
    public static void main(String[] args) {
        String fileName = "/Users/ironcolumn/IdeaProjects/Java-Study/15-Container/src/_8_理解Map/Ex13.java";
        Set<String> words = new TreeSet<>(new TextFile(fileName, "\\W+"));
        AssociativeArray<String, Integer> wordCount = new AssociativeArray<>(words.size());
        ArrayList<String> fileList = new TextFile(fileName, "\\W+");
        for (String word : words) {
            int countNum = 0;
            for (String s : fileList) {
                if (s.equals(word)) {
                    countNum++;
                }
            }
            wordCount.put(word, countNum);
        }
        System.out.println(wordCount);

    }
}
