/**
 * @Author ChenMingYang
 * @Date 2021-05-29 13:02
 */
class A {
}

class B {
}

class C extends A {
    public B b = new B();
}
public class Ex04 {
    public static void main(String[] args) {
        C c = new C();
    }
}
