package _2;

import java.util.Collections;

/**
 * @Author ChenMingYang
 * @Date 2021-08-06 17:20
 */

public class GenericToyTest {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Class<FancyToy> ftClass = FancyToy.class;
        FancyToy fancyToy = ftClass.newInstance();

        Class<? super FancyToy> up = ftClass.getSuperclass();
        //!Class<Toy> up2 = ftClass.getSuperclass();
        //️getSuperclass()返回的是一个「基类」，即使类型一样也不能直接接手
        Object object = up.newInstance();
    }
}
