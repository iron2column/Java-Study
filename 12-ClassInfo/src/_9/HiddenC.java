package _9;

/**
 * @Author ChenMingYang
 * @Date 2021-08-10 16:22
 */
class C implements A {
    public void f() {
        System.out.println("public C.f()");
    }
    public void g() {
        System.out.println("public C.g()");
    }
    void u() {
        System.out.println("package C.u()");
    }
    protected void v() {
        System.out.println("protected C.v()");
    }
    private void w() {
        System.out.println("private C.w()");
    }
}

public class HiddenC {
    public static A makeA() {
        return new C();
    }
    public static void main(String[] args) {
        A a = HiddenC.makeA();
        a.f();

        C c = (C) a;
        c.f();
        c.g();
        c.u();
        c.v();
        //c.w();

    }
}
