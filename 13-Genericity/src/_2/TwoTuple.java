package _2;

/**
 * @Author ChenMingYang
 * @Date 2021-08-12 21:35
 */

public class TwoTuple <A, B>{
    //注意特意设置为public
    public final A first;
    public final B second;

    public TwoTuple(A first, B second) {
        this.first = first;
        this.second = second;
    }


    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }

    public static void main(String[] args) {
        TwoTuple<Holder1, Holder2> tuple = new TwoTuple<Holder1, Holder2>(new Holder1(new Automobile()), new Holder2(new Automobile()));
        Holder1 first = tuple.first;
        Holder2 second = tuple.second;

        //!tuple.first = new Holder1(new Automobile());
    }
}
