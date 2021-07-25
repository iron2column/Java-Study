/**
 * @Author ChenMingYang
 * @Date 2021-07-25 17:26
 */
class MyTestException extends Exception {
    String myString;
    public MyTestException(String message) {
        super(message);
        this.myString = message;
    }
    public void display() {
        System.out.println("myString = " + myString);
    }
}
public class Ex06 {
    public static void f() throws MyTestException {
        System.out.println("这里是触发函数f()");
        throw new MyTestException("Hello Test");
    }
    public static void main(String[] args) {
        try {
            f();
        } catch (MyTestException e) {
            e.printStackTrace();
            e.display();
        }
    }
}
