/**
 * @Author ChenMingYang
 * @Date 2021-05-28 15:40
 */
public class Ex04 {
    static void f(float i,Character...args) {
        System.out.println("first");
    }

    /*
        static void f(Character ...args) {
        System.out.println("second");
    } //不能使用这个，会出现编译错误
     */
    static void f(char c,Character ...args) {
        System.out.println("second");
    }

    public static void main(String[] args) {
        f(1,'a');
        f('s','a', 'b');
    }
}
