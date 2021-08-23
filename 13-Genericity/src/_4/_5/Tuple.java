package _4._5;

import _2.ThreeTuple;
import _2.TwoTuple;

/**
 * @Author ChenMingYang
 * @Date 2021-08-23 16:28
 */

public class Tuple {
    public static <A, B> TwoTuple<A, B> tuple(A a, B b) {
        return new TwoTuple<A, B>(a, b);
    }

    public static <A, B, C> ThreeTuple<A, B, C> tuple(A a, B b, C c) {
        return new ThreeTuple<A, B, C>(a,b,c);
    }
}
