package _8._2;

/**
 * @Author ChenMingYang
 * @Date 2021-08-26 15:59
 */
class Generic<T> {
    T x;
}
public class ArrayOfGenericReference {
    static Generic<Integer>[] gia;

    public static void main(String[] args) {
        gia = new Generic[4];
        for (int i = 0; i < gia.length; i++) {
            gia[i] = new Generic<Integer>();
        }
        for (Generic<Integer> integerGeneric : gia) {
            System.out.println(integerGeneric);
        }
        System.out.println(gia.getClass().getSimpleName());
        System.out.println((gia[0].x=2).getClass().getSimpleName());
    }
}
