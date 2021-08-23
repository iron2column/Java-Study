package _3.coffeeKind;

/**
 * @Author ChenMingYang
 * @Date 2021-08-14 13:18
 */

public class Coffee {
    private static long counter = 0;
    private final long id = counter++;
    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}
