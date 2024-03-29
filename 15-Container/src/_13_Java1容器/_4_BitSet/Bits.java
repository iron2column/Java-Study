package _13_Java1容器._4_BitSet;

import java.util.BitSet;
import java.util.Random;

/**
 * @Author ChenMingYang
 * @Date 2021-10-12 17:12
 */

public class Bits {
    public static void printBitSet(BitSet b) {
        System.out.println("bits: " + b);
        StringBuilder bbits = new StringBuilder();

        for (int i = 0; i < b.size(); i++) {
            bbits.append(b.get(i) ? "1" : "0");
        }
        System.out.println("bit pattern: " + bbits);
    }

    public static void main(String[] args) {
        Random random = new Random(47);
        byte bt = (byte) random.nextInt();
        BitSet bb = new BitSet();
        for (int i = 7; i >= 0; i--) {
            if (((1 << i) & bt) != 0) {
                bb.set(i);
            } else {
                bb.clear(i);
            }
        }
    }
}
