package _2._1;

import _3.generator.Generator;

import java.util.ArrayList;

/**
 * @Author ChenMingYang
 * @Date 2021-09-08 14:01
 */

public class CollectionData<T> extends ArrayList<T> {
    public CollectionData(Generator<T> gen, int quantity) {
        for (int i = 0; i < quantity; i++) {
            add(gen.next());
        }
    }

    public static <T> CollectionData<T> list(Generator<T> gen, int quantity) {
        return new CollectionData<T>(gen, quantity);
    }

}
