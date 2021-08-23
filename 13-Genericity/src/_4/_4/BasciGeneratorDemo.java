package _4._4;

import _3.generator.Generator;

/**
 * @Author ChenMingYang
 * @Date 2021-08-23 16:21
 */

public class BasciGeneratorDemo {
    public static void main(String[] args) {
        Generator<CountedObject> gen = BasicGenerator.create(CountedObject.class);
        for (int i = 0; i < 5; i++) {
            System.out.println(gen.next());
        }
    }
}
