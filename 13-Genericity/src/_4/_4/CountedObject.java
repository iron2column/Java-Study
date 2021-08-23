package _4._4;

/**
 * @Author ChenMingYang
 * @Date 2021-08-23 16:19
 */

public class CountedObject {
    private static long counter = 0;
    private final long id = counter++;
    public long id() {
        return id;
    }
    public String toString() {
        return "CountedObject " + id;
    }
}
