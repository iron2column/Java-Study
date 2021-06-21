/**
 * @Author ChenMingYang
 * @Date 2021-06-21 14:57
 */

class Outer {
    class Inner {

    }

    Inner getInner() {
        return new Inner();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Inner inner = outer.getInner();
    }
}
public class Ex03 {
}
