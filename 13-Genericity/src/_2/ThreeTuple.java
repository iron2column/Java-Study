package _2;

/**
 * @Author ChenMingYang
 * @Date 2021-08-13 16:29
 */

public class ThreeTuple<A, B, C> extends TwoTuple<A, B> {
    public final C third;

    public ThreeTuple(A first, B second,C third) {
        super(first, second);
        this.third = third;
    }

    public String toString() {
        return "(" + first + ", " + second + ", " + third + ")";
    }
}
