package _2;

/**
 * @Author ChenMingYang
 * @Date 2021-08-13 16:38
 */

public class FiveTuple<A, B, C, D, E> extends FourTuple<A, B, C, D> {
    public final E fivth;

    public FiveTuple(A first, B second, C third, D fourth, E fivth) {
        super(first, second, third, fourth);
        this.fivth = fivth;
    }

    public String toString() {
        return "(" + first + ", " + second + ", " + third + ", " + fourth + ", " + fivth + ")";
    }
}
