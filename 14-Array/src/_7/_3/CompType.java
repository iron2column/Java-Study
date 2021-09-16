package _7._3;

import _3.generator.Generator;
import _6._3.Generated;

import java.util.Arrays;
import java.util.Random;

/**
 * @Author ChenMingYang
 * @Date 2021-09-07 20:28
 */

public class CompType implements Comparable<CompType> {
    int i;
    public int j;
    private static int count = 1;
    public CompType(int i, int j) {
        this.i = i;
        this.j = j;
    }
    public String toString() {
        String result = "[i = " + i + ", j= " + j + "]";
        if (count++ % 3 == 0) {
            result += "\n";
        }
        return result;
    }

    public int compareTo(CompType rv) {
        return (i < rv.i ? -1 : (i == rv.i ? 0 : 1));
    }

    private static Random r = new Random(47);

    public static Generator<CompType> generator() {
        return new Generator<CompType>() {
            public CompType next() {
                return new CompType(r.nextInt(100),r.nextInt(100));
            }
        };
    }

    public static void main(String[] args) {
        CompType[] a = Generated.array(new CompType[12], generator());
        System.out.println("Arrays.toString(a) = " + Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Arrays.toString(a) = " + Arrays.toString(a));
    }
}
