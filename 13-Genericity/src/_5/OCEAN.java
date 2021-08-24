package _5;

import _3.generator.Generator;
import _4._3.Generators;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Author ChenMingYang
 * @Date 2021-08-24 13:43
 */
class LittleFish {
    private static long counter = 1;
    private final long id = counter++;

    private LittleFish() {
    }

    public static Generator<LittleFish> generator() {
        return new Generator<LittleFish>() {
            public LittleFish next() {
                return new LittleFish();
            }
        };
    }

    public String toString() {
        return "LittleFish{" +
                "id=" + id +
                '}';
    }

}

class BigFish {
    private static long counter = 1;
    private final long id = counter++;

    private BigFish() {
    }

    public static Generator<BigFish> generator() {
        return new Generator<BigFish>() {
            public BigFish next() {
                return new BigFish();
            }
        };
    }

    public String toString() {
        return "BigFish{" +
                "id=" + id +
                '}';
    }
}

public class OCEAN {
    public static void ecological(BigFish bigFish, LittleFish littleFish) {
        System.out.println(bigFish + " eat " + littleFish);
    }

    public static void main(String[] args) {
        ArrayList<BigFish> bigLine = new ArrayList<>();
        ArrayList<LittleFish> littleLine = new ArrayList<>();

        Generators.fill(bigLine, BigFish.generator(), 3);
        Generators.fill(littleLine, LittleFish.generator(), 10);

        System.out.println(bigLine);
        System.out.println(littleLine);

        for (LittleFish littleFish : littleLine) {
            ecological(bigLine.get(new Random().nextInt(bigLine.size())), littleFish);
        }
    }
}
