package _3;

import java.util.Iterator;

/**
 * @Author ChenMingYang
 * @Date 2021-08-16 10:32
 */

public class IterableFibonacci extends Fibonacci implements Iterable<Integer> {
    private int n;

    public IterableFibonacci(int n) {
        this.n = n;
    }

    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            public boolean hasNext() {
                return n>0;
            }
            public Integer next() {
                n--;
                return IterableFibonacci.this.next();
            }
        };
    }


    public static void main(String[] args) {
        for (Integer integer : new IterableFibonacci(18)) {
            System.out.print(integer + " ");
        }
    }
}
