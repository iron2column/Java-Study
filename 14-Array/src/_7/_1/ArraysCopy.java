package _7._1;

/**
 * @Author ChenMingYang
 * @Date 2021-09-07 15:37
 */

public class ArraysCopy {


    private ArraysCopy() {
    }

    public static void copyAll(Object[] src,Object[] tar) {
        System.arraycopy(src,0,tar,0,src.length);
    }
}
