package _3;

import java.util.Iterator;

/**
 * @Author ChenMingYang
 * @Date 2021-08-16 10:45
 */

public class Iterable2Fibonacci implements Iterable<Integer> {
    private int count = 0;
    private Fibonacci fibonacci = new Fibonacci();

    public Iterable2Fibonacci(int count) {
        this.count = count;
    }

    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            public boolean hasNext() {
                return count>0;
            }
            public Integer next() {
                count--;
                return fibonacci.next();
            }
        };
    }

    public static void main(String[] args) {
        for (Integer integer : new Iterable2Fibonacci(5)) {
            System.out.println(integer);
        }
    }
}
