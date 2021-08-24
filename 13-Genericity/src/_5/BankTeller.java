package _5;

import _3.generator.Generator;
import _4._3.Generators;

import java.util.*;

/**
 * @Author ChenMingYang
 * @Date 2021-08-24 09:31
 */
class Customer {
    private static long counter = 1;
    private final long id = counter++;
    private Customer() {}
    public String toString() {
        return "Customer{" +
                "id=" + id +
                '}';
    }
    public static Generator<Customer> generator() {
        return new Generator<Customer>() {
            public Customer next() {
                return new Customer();
            }
        };
    }
}

class Teller {
    private static long counter = 1;
    private final long id = counter++;
    private Teller(){}
    public String toString() {
        return "Teller{" +
                "id=" + id +
                '}';
    }
    public static Generator<Teller> generator() {
        return new Generator<Teller>(){
            public Teller next() {
                return new Teller();
            }
        };
    }
}

public class BankTeller {
    public static void serve(Teller t, Customer c) {
        System.out.println(t + " serves " + c);
    }

    public static void main(String[] args) {
        Random random = new Random(47);

        Queue<Customer> line = new LinkedList<>();
        Generators.fill(line, Customer.generator(), 15);

        List<Teller> tellers = new ArrayList<>();
        Generators.fill(tellers, Teller.generator(), 4);

        for (Customer c : line) {
            serve(tellers.get(random.nextInt(tellers.size())), c);
        }

    }


}
