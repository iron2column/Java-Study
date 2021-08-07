package _2;

/**
 * @Author ChenMingYang
 * @Date 2021-08-06 16:06
 */

public class GenericClassReferences {
    public static void main(String[] args) {
        //intClass没有限定「哪个类」能被引用
        Class intClass = int.class;
        //genericIntClass限定了只能引用「Integer类」
        Class<Integer> genericIntClass = int.class;
        //genericIntClass2使用了通配符进行更模糊的限定
        Class<?> genericIntClass2 = int.class;
        //尽管Number->Integer->int 但是无效
        //!Class<Number> genericNumberClass = int.class; 非法

        genericIntClass = Integer.class;

        intClass = double.class;
        //!genericIntClass = double.class; ILLEGAL
        genericIntClass2 = double.class;

    }
}
