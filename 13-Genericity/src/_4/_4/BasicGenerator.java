package _4._4;

import _3.coffeeKind.Coffee;
import _3.generator.Generator;

/**
 * @Author ChenMingYang
 * @Date 2021-08-23 14:06
 */

public class BasicGenerator<T> implements Generator<T> {
    private Class<T> type;

    public BasicGenerator(Class<T> type) {
        this.type = type;
    }

    public T next() {
        try {
            return type.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> Generator<T> create(Class<T> type) {
        try {
            return new BasicGenerator<T>(type);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Generator<Coffee> coffeeGenerator = BasicGenerator.create(Coffee.class);
        System.out.println(coffeeGenerator.next());
    }


}
