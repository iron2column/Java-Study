package _7_队列._1_优先级队列;

import java.util.PriorityQueue;
import java.util.Random;

/**
 * @Author ChenMingYang
 * @Date 2021-09-27 18:13
 */
class CreateClass implements Comparable<CreateClass> {
    public Integer integer = new Random().nextInt(100);

    @Override
    public int compareTo(CreateClass o) {
        return (o.integer.compareTo(integer));
    }

    @Override
    public String toString() {
        return "CreateClass{" +
                "integer=" + integer +
                '}';
    }
}

public class Ex11 {
    public static void main(String[] args) {
        PriorityQueue<CreateClass> pq = new PriorityQueue<>();
        pq.add(new CreateClass());
        pq.add(new CreateClass());
        pq.add(new CreateClass());
        pq.add(new CreateClass());
        pq.add(new CreateClass());
        System.out.println("pq = " + pq);

        while (pq.size() != 0) {
            System.out.println("pq.poll() = " + pq.poll());
        }
    }
}
