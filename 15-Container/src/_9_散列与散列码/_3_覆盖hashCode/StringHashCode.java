package _9_散列与散列码._3_覆盖hashCode;

/**
 * @Author ChenMingYang
 * @Date 2021-10-02 23:02
 */

public class StringHashCode {
    public static void main(String[] args) {
        String[] hellos = "Hello Hello".split(" ");
        System.out.println(hellos[0].hashCode());
        System.out.println(hellos[1].hashCode());
    }
}
