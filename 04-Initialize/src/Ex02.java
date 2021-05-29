/**
 * @Author ChenMingYang
 * @Date 2021-05-26 20:29
 */

public class Ex02 {
    String s = "init";
    int i = 0;

    public Ex02() {
        this("what", 2);
    }
    public Ex02(String s) {
        this.s = s;
    }
    public Ex02(int i) {
        this.i = i;
    }

    public Ex02(String s, int i) {

        // 这不应该出现在这 System.out.println("go");
        this(s);
        this.i = i;
    }

    public void fun() {
        System.out.println("fun");
    }




    public static void main(String[] args) {
        Ex02 ex02 = new Ex02("nihao");
        System.out.println(ex02.s);
    }
}
