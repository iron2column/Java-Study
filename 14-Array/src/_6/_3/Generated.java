package _6._3;

import _2._1.CollectionData;
import _3.generator.Generator;

import java.lang.reflect.Array;

/**
 * @Author ChenMingYang
 * @Date 2021-09-06 15:34
 */

public class Generated {
    public static <T> T[] array(T[] a, Generator<T> gen) {
        return new CollectionData<T>(gen, a.length).toArray(a);
    }

    @SuppressWarnings("unchecked")
    public static <T> T[] array(Class<T> type, Generator<T> gen, int size) {
        T[] a = (T[]) Array.newInstance(type, size);
        return new CollectionData<T>(gen, size).toArray(a);
    }
}
