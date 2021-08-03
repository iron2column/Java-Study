import java.util.ArrayList;

/**
 * @Author ChenMingYang
 * @Date 2021-07-26 12:12
 */

public class InfiniteRecursion  {
    //从第一进入此toString方法时就开始进入了递归的陷阱
    public String toString() {
        //由于需要的是String类型，而this是本对象类型，
        //所以要进行类型向String进行转换，这不，就会调用自己的toString去转换类型。
        //这里说明的是why发生了递归
        return  this+"\n";
    }

    public static void main(String[] args) {
        //"后来添加"：同理这样也会陷入递归而栈溢出
        System.out.println(new InfiniteRecursion());

        ArrayList<InfiniteRecursion> infiniteRecursions = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            //还记得之前说过，toString方法会在new的时候就进行吗？
            //因此在产生第一个对象时，就陷入了循环递归栈溢出。这里说明的是异常是when发生的
            infiniteRecursions.add(new InfiniteRecursion());
        }
        String s = infiniteRecursions.toString();
        System.out.println(s);
    }
}
