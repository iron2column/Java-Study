/**
 * @Author ChenMingYang
 * @Date 2021-05-25 11:41
 */

public class Ex07 {
    public static void main(String[] args) {

        String s1 = "im no";
        String s2 = "im no";
        System.out.println(s1 == s2);

        s1 = "im yes";
        System.out.println(s1 == s2);
        /*output:
            true
            false
         */


    }

    private static void f2() {
        String s1 = new String("no");
        String s2 = new String("no");
        fun(s1, s2);
        /*output:
            s1 = no  s2 = no
            s1.equals(s2)
            s1.hashcode()= 3521
            s2.hashcode()= 3521
         */
    }

    private static void f1() {
        String ss = "ok";
        fun("ok", ss);
        /*output:
            s1 = ok  s2 = ok
            s1 == s2
            s1.hashcode()= 3548
            s2.hashcode()= 3548
         */
    }

    public static void fun(String s1, String s2) {
        System.out.println("s1 = " + s1 + "  s2 = " + s2);
        if (s1 == s2) {
            System.out.println("s1 == s2");
            System.out.println("s1.hashcode()= " + s1.hashCode());
            System.out.println("s2.hashcode()= " + s2.hashCode());
        }
        if (s1.equals(s2)) {
            System.out.println("s1.equals(s2)");
            System.out.println("s1.hashcode()= " + ((Object)s1).hashCode());
            System.out.println("s2.hashcode()= " + ((Object)s2).hashCode());
        }
    }
}
