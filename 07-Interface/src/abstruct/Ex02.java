package abstruct;

/**
 * @Author ChenMingYang
 * @Date 2021-06-02 16:48
 */

abstract class NoAbFun {
    public void say() {
        System.out.println("saying");
    }
}

public class Ex02 {
//    public NoAbFun noAbFun;

/*    //似乎只能以这种方式使用抽象类
    static void f(NoAbFun noAbFun) {
        noAbFun.say();
    }*/

    public static void main(String[] args) {
//        Ex02 ex02 = new Ex02();
//        空指针异常
//        ex02.noAbFun.say();
    }

}
