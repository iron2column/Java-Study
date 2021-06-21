/**
 * @Author ChenMingYang
 * @Date 2021-06-21 15:56
 */

class DotThis {
    void f() {
        System.out.println("DOtThis.f()");
    }

    public class Inner {
        public DotThis outer() {
            //HERE!
            return DotThis.this;
        }
    }

    public Inner inner() {
        return new Inner();
    }


}

public class Ex07 {
    public static void main(String[] args) {
        DotThis dotThis = new DotThis();

        DotThis.Inner inner = dotThis.inner();

        DotThis outer = inner.outer();
    }
}
