package _7;

/**
 * @Author ChenMingYang
 * @Date 2021-08-25 11:35
 */
interface IFace {
    void f();

    void g();
}

class Impl implements IFace {
    @Override
    public void f() {
        System.out.println(this.getClass().getSimpleName()+":f()");
    }

    @Override
    public void g() {
        System.out.println(this.getClass().getSimpleName()+":g()");
    }

    public void q() {

    }
}
public class Ex20 {
    public static  <T extends IFace> void test(T t) {
        t.f();
        t.g();
        //!t.q();
    }

    public static void main(String[] args) {
        test(new Impl());
    }
}
