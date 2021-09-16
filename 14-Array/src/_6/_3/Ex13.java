package _6._3;

import _6._2.CountingGenerator;

/**
 * @Author ChenMingYang
 * @Date 2021-09-13 15:52
 */

public class Ex13 {
    public static void main(String[] args) {
        String s = "";
        CountingGenerator.Character character = new CountingGenerator.Character();
        do {
            s += character.next();
        } while (s.length() < 15);
        System.out.println("s = " + s);
    }
}
