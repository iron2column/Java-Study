package _2;

/**
 * @Author ChenMingYang
 * @Date 2021-08-13 17:07
 */

public class SixTuple<A, B, C, D, E, F> extends FiveTuple<A, B, C, D, E>{

    public final F sixth;
    public SixTuple(A first, B second, C third, D fourth, E fivth, F sixth) {
        super(first, second, third, fourth, fivth);
        this.sixth = sixth;
    }


    @Override
    public String toString() {
        return "SixTuple{" +
                "fivth=" + fivth +
                ", fourth=" + fourth +
                ", sixth=" + sixth +
                ", third=" + third +
                ", first=" + first +
                ", second=" + second +
                '}';
    }

    public static void main(String[] args) {
        SixTuple<Vehicle, Amphibian, String, Integer, Double, String> sixTuple =
                new SixTuple<>(new Vehicle(), new Amphibian(), "hi", 47, 11.1, "SIX");

        System.out.println(sixTuple);
        System.out.println(sixTuple.second);
    }
}
