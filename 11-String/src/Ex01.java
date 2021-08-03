/**
 * @Author ChenMingYang
 * @Date 2021-07-25 18:40
 */
class Immutable {
    public static String upcase(String s) {
        return s.toUpperCase();
    }

    public static void main(String[] args) {
        String q = "howdy";
        System.out.println(q);
        String qq = upcase(q);
        System.out.println(qq);
        System.out.println(q);
    }
}
public class Ex01 {
}
