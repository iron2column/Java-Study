package _2;

import java.util.Random;

/**
 * @Author ChenMingYang
 * @Date 2021-08-06 15:21
 */

class Initable {
    static final int staticFinal = 47;
    static final int staticFinal2 = ClassInitialization.rand.nextInt(1000);
    static{
        //如果打印出了这句话，说明此类就被「初始化」了，反之则没有
        System.out.println("Initializing Initable");
    }
}

class Initable2{
    static int staticNoFinal = 147;
    static{
        //如果打印出了这句话，说明此类就被「初始化」了，反之则没有
        System.out.println("Initializing Initable2");
    }
}

class Initable3{
    static int staticNoFinal = 74;
    static{
        //如果打印出了这句话，说明此类就被「初始化」了，反之则没有
        System.out.println("Initializing Initable3");
    }
}

public class ClassInitialization {
    public static Random rand = new Random(47);

    public static void main(String[] args) throws ClassNotFoundException {
        Class initable = Initable.class; //没有触发初始化
        System.out.println("After creating Initable ref");
        //Does not trigger initialization
        System.out.println(Initable.staticFinal); //没有触发初始化
        //Does  trigger initialization
        System.out.println(Initable.staticFinal2); //触发

        System.out.println("==============");

        //Does  trigger initialization
        System.out.println(Initable2.staticNoFinal); //触发

        System.out.println("==============");

        Class initable3 = Class.forName("_2.Initable3"); //触发
        System.out.println("After creating Initable3 ref");
        System.out.println(Initable3.staticNoFinal);
    }

}
