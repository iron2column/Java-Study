import java.util.Formatter;

/**
 * @Author ChenMingYang
 * @Date 2021-07-26 19:01
 */

public class Ex06 {
    int i = 1;
    long l = 2L;
    float f = 3.0f;
    double d = 4.00d;

    public String toString() {
        return String.format("i=%s \nl=%s \nf=%s \nd=%s \n", i, l, f, d);
    }

    public static void main(String[] args) {
        System.out.println(new Ex06());
    }
}
