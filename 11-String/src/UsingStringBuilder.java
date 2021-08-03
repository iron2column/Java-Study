import java.util.Random;

/**
 * @Author ChenMingYang
 * @Date 2021-07-26 11:36
 */

public class UsingStringBuilder {
    public static Random random = new Random(47);

    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < 25; i++) {
            //在循环体内部处理安装模式处理
            result.append(random.nextInt(100));
            result.append(", ");
        }
        //结束循环体后对格式进行包装处理
        result.delete(result.length() - 2, result.length());
        result.append("]");
        return result.toString();
    }

    public static void main(String[] args) {
        //对象实例化时，toString就已经完成
        System.out.println(new UsingStringBuilder());
//        UsingStringBuilder usb = new UsingStringBuilder();
//        System.out.println(usb);
    }
}
