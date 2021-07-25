/**
 * @Author ChenMingYang
 * @Date 2021-07-24 13:10
 */

/**
 * 自定义异常
 */
class SimpleException extends Exception {

}

/**
 * 注意throws和throw的区别
 */
class InheritExceptions {
    public void f() throws SimpleException {
        System.out.println("Throw SimpleException from f()");
        throw new SimpleException();
    }
}



public class Ex01 {
    public static void main(String[] args) {
        InheritExceptions sed = new InheritExceptions();

        try {
            sed.f();
        } catch (SimpleException e) {
            System.out.println("Caught it!");
        }
    }
}
