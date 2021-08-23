package _4;

import _3.coffeeKind.Coffee;
import _3.generator.CoffeeGenerator;
import _3.Fibonacci;
import _3.generator.Generator;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Author ChenMingYang
 * @Date 2021-08-16 15:23
 */

public class Generators {
    public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++) {
            coll.add(gen.next());
        }
        return coll;
    }


    public static void main(String[] args) {

        Collection<Coffee> coffees = Generators.fill(new ArrayList<Coffee>(), new CoffeeGenerator(), 4);
        Collection<Integer> fibonaciis = Generators.fill(new ArrayList<Integer>(), new Fibonacci(), 12);
    }
}
