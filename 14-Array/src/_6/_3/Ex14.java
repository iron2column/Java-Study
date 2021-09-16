package _6._3;

import _6._2.CountingGenerator;

import java.util.Arrays;

/**
 * @Author ChenMingYang
 * @Date 2021-09-13 15:58
 */

public class Ex14 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?>[] classes = CountingGenerator.class.getClasses();
        String[] names = new String[classes.length];
        for (int i = 0; i < classes.length; i++) {
            String name = classes[i].getSimpleName().toLowerCase();
            if (name.equals("string")) {
                names[i] = "String";
            } else {
                names[i] = name;
            }
        }
        System.out.println("Arrays.toString(names) = " + Arrays.toString(names));
    }
}
