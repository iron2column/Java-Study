package intType;

/**
 * about int
 * @Author ChenMingYang
 * @Date 2021-05-22 20:58
 */

public class IntType {


    private static void commoninfo_int() {
        System.out.println("int 的位数="+Integer.SIZE);
        System.out.println("int 的字节数="+Integer.BYTES);
        int maxValue = Integer.MAX_VALUE;
        int minValue = Integer.MIN_VALUE;
        System.out.println("数据范围 = ["+minValue+","+maxValue+"]  大约为21亿");
    }
}
