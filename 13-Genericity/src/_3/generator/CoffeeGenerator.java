package _3.generator;

import _3.coffeeKind.*;

import java.util.Iterator;
import java.util.Random;

/**
 * @Author ChenMingYang
 * @Date 2021-08-14 13:22
 */

public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {

    private static Random random = new Random(47);
    private int size = 0;//注意手动添加默认值
    private Class[] types = {Latte.class, Mocha.class, Cappuccino.class, Americano.class, Breve.class};

    //--------------------------------------------------------------------------------
    //  构造器
    public CoffeeGenerator() {
    }
    public CoffeeGenerator(int size) {
        this.size = size;
    }
    //--------------------------------------------------------------------------------

    /**
     * 随机获取一个Coffee子类实例<br>
     * 通过[反射][随机数][try-catch][类型强转]组合实现
     * @return
     */
    public Coffee next() {
        try {
            return (Coffee) types[random.nextInt(types.length)].newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    //--------------------------------------------------------------------------------
    //  内部类
    class CoffeeIterator implements Iterator<Coffee> {
        int count = size;

        public boolean hasNext() {
            return count > 0;
        }

        public Coffee next() {
            count--;
            return CoffeeGenerator.this.next();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
    //--------------------------------------------------------------------------------
    /**
     * 实现for-each的唯一且必须途径<br>
     * 获取一个内部迭代器,其实现了Iterator那么它就是Iterator
     * @return
     */
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }


    public static void main(String[] args) {
        CoffeeGenerator gen = new CoffeeGenerator();
        for (int i = 0; i < 5; i++) {
            System.out.println(gen.next());
        }

        System.out.println("======");

        for (Coffee coffee : new CoffeeGenerator(5)) {
            System.out.println(coffee);
        }



    }


}
