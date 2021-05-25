/**
 * @Author ChenMingYang
 * @Date 2021-05-24 13:48
 */

public class Ex02 {
    public static void main(String[] args) {
        suf();
        pre();
    }

    private static void suf() {
        System.out.println("=====前缀======");
        int i = 100;
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);
        System.out.println("=====前缀======");

    }

    private static void pre() {
        System.out.println("=====后缀======");
        int i = 100;
        System.out.println(i);
        System.out.println(i++);
        System.out.println(i);
        System.out.println("=====后缀======");
    }
}
