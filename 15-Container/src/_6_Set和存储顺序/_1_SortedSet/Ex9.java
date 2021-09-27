package _6_Set和存储顺序._1_SortedSet;

import _6._2.RandomGenerator;

import java.util.TreeSet;

/**
 * @Author ChenMingYang
 * @Date 2021-09-27 00:09
 */

public class Ex9 {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>(String::compareToIgnoreCase);

        RandomGenerator.String strUtil = new RandomGenerator.String(1);
        for (int i = 0; i < 10; i++) {
            set.add(strUtil.next());
        }
        System.out.println("set = " + set);
    }
}
