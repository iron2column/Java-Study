package _9;

/**
 * @Author ChenMingYang
 * @Date 2021-08-28 15:45
 */
interface IFace1 {

}

interface IFace2 {

}

class Impl_1_2 implements IFace1, IFace2 {

}


public class Ex25 {
    <T extends IFace1> void genM1(T t) {
        System.out.println(t);
    }

    <T extends IFace2> void genM2(T t) {
        System.out.println(t);
    }

    public static void main(String[] args) {
        Impl_1_2 impl_1_2 = new Impl_1_2();
        Ex25 ex25 = new Ex25();
        ex25.genM1(impl_1_2);
        ex25.genM2(impl_1_2);

    }
}
