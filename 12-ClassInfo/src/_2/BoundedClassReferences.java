package _2;

/**
 * @Author ChenMingYang
 * @Date 2021-08-06 16:22
 */

public class BoundedClassReferences {
    public static void main(String[] args) {

        //  为通配符限定「范围」
        Class<? extends Number> bounded = int.class;
        bounded = double.class;
        bounded = Number.class;
        //or anything else derived from Number

    }
}
