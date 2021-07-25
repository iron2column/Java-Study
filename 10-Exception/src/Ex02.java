/**
 * @Author ChenMingYang
 * @Date 2021-07-25 16:01
 */

/**
 * 具有两种构造方法的自定义异常
 */
class MyException extends Exception {
    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}

class FullConstructors {
    public static void f() throws MyException {
        System.out.println("Throwing MyException from f()");
        throw new MyException();
    }

    public static void g() throws MyException {
        System.out.println("Throwing MyException from g()");
        throw new MyException("Originated in g()");
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (MyException e) {
            e.printStackTrace(System.out);
        }

        try {
            g();
        } catch (MyException e) {
            e.printStackTrace(System.out);
        }
    }
}

public class Ex02 {
}
