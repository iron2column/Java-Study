package _2;

/**
 * @Author ChenMingYang
 * @Date 2021-08-12 17:13
 */

public class Holder_ex2<T> {
    private T[] as;

    public Holder_ex2(T... as) {
        System.out.println(as.length);
    }

    public static void main(String[] args) {
        Holder_ex2<Automobile> automobileHolder_ex2 = new Holder_ex2<>();
    }
}
