import java.util.Random;

/**
 * @Author ChenMingYang
 * @Date 2021-05-29 20:35
 */
class Value {
    int i;

    public Value(int i) {
        this.i = i;
    }
}

class FinalData {
    private static Random rand = new Random(47);

    private String id;
    public FinalData(String id) {
        this.id = id;
    }

    private final int valueOne = 9;
    private static final int VALUE_TWO = 99;
    public static final int VALUE_THREE = 39;

    private final int i4 = rand.nextInt(20);
    static final int INT_5 = rand.nextInt(20);

    //对对象的使用
    private Value v1 = new Value(11);
    private final Value v2 = new Value(22);
    private static final Value VAL_3 = new Value(33);

    //对数组对使用
    private final int[] a = {1, 2, 3, 4, 5, 6};


    public String toString() {
        return id + ": " + "i4 = " + i4 + ",INT_5 = " + INT_5;
    }

    public static void main(String[] args) {
        FinalData fd1 = new FinalData("fd1");

//        fd1.valueOne++; //无法改变：不可赋值
//        fd1.v2 = new Value(0); //无法改变：因为在试图改变常量引用
        fd1.v2.i++;//v2是Value类的引用，所以引用是final但值不是
        fd1.v1 = new Value(9);

        for (int i = 0; i < fd1.a.length; i++) {
//            fd1.a = new int[]{2, 3, 4, 5, 6, 7}; //不可以是因为 fd1.a 是引用常量，指向的对象是不能改变的
            fd1.a[i]++; //这个可以是因为 fd1.a 数组引用是final 但里面的值可不是
        }

//        fd1.VAL_3 = new Value(0);//无法改变，因为试图改变引用

        System.out.println(fd1);
        System.out.println("Creating new FinalData");
        FinalData fd2 = new FinalData("fd2");
        System.out.println(fd1);
        System.out.println(fd2);
    }
}

public class Ex08 {

}
