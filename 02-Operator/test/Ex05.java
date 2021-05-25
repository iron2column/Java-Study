/**
 * 短路现象
 * @Author ChenMingYang
 * @Date 2021-05-24 14:29
 */

public class Ex05 {


    static boolean test1(int val) {
        System.out.println("test1("+val+")");
        System.out.println("result:" + (val < 1));
        return val < 1;
    }
    static boolean test2(int val) {
        System.out.println("test2("+val+")");
        System.out.println("result:" + (val < 2));
        return val < 2;
    }    static boolean test3(int val) {
        System.out.println("test3("+val+")");
        System.out.println("result:" + (val < 3));
        return val < 3;
    }

    /**
     * 很明显，表达式中test1 和 test2都执行了， 但是我们期望的test3没有执行，就像短路了一样
     * 这给予我们一些启示：没有必要执行的可以后置用来提升性能
     * @param args
     */
    public static void main(String[] args) {
        boolean a = test1(0) && test2(2) && test3(3);
        System.out.println("exprtession is" + a );
    }
}
