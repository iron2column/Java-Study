package _7._1;

/**
 * @Author ChenMingYang
 * @Date 2021-09-02 15:01
 */
public class BerylliumSphere {
    private static long counter;
    private final long id = counter++;
    public String toString() {
        return "Sphere " + id;
    }
}

