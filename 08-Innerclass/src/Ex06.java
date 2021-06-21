/**
 * @Author ChenMingYang
 * @Date 2021-06-21 15:46
 */
class Outer2 {
    private String string;

    public Outer2(String string) {
        this.string = string;
    }


    Inner getInner() {
        return new Inner();
    }

    class Inner {
        public String toString() {
            return string + " ";
        }
    }
}


public class Ex06 {
    public static void main(String[] args) {
        Outer2 outer2 = new Outer2("hello");
        Outer2.Inner inner = outer2.getInner();
        System.out.println(inner.toString());
    }
}
