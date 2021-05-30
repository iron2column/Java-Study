/**
 * @Author ChenMingYang
 * @Date 2021-05-29 12:07
 */
class Father {
    public int public_int = 0;
    protected int protected_int = 1;
    int _int = 2;
    private int private_int = 3;

    public void pub_fun() {
        System.out.println("pub_fun");
    }

    void _fun() {
        System.out.println("_fun");
    }

    protected void pro_fun() {
        System.out.println("pro_fun");
    }

    private void pri_fun() {
        System.out.println("pri_fun");
    }
}

public class Ex02 extends Father {
    public int public_int;

    public static void main(String[] args) {


        Ex02 ex02 = new Ex02();
        ex02.pub_fun();


        System.out.println("===========");
        /*
        //父类的public
        ex02.pub_fun();
        //父类的
        ex02._fun();
        //父类的protect
        ex02.pro_fun();
        //父类的private 不可见
        //!ex02.pri_fun();
        */

        System.out.println(ex02.public_int);
        //!System.out.println(ex02.private_int);

    }

}
