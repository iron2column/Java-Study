package abstruct;

/**
 * @Author ChenMingYang
 * @Date 2021-06-02 16:59
 */
abstract class Base {
    abstract void print();
}

class UseBase extends Base {
    public int i = 2;

    void print() {
        System.out.println(i);
    }
}
public class Ex03 {
    public static void main(String[] args) {
        UseBase useBase = new UseBase();
        useBase.print();
    }
}
