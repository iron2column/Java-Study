/**
 * @Author ChenMingYang
 * @Date 2021-07-26 15:09
 */

public class SimpleFormat {
    public static void main(String[] args) {
        int x = 5;
        double y = 5.332542;
        //传统方式：直观但构造麻烦
        System.out.println("Row 1: [" + x + " " + y + "]");
        //新的方式1：构造灵活
        System.out.format("Row 1: [%d %f]\n", x, y);
        //新的方式2：其实现是调用了format
        System.out.printf("Row 1: [%d %f]\n", x, y);
    }
}
