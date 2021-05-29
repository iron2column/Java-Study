package enumTest;

/**
 * @Author ChenMingYang
 * @Date 2021-05-28 15:52
 */

public enum Ex01 {
    FIRST,SECOND,THIRD
}

class Test {
    public static void main(String[] args) {
        Ex01 first = Ex01.FIRST;
        //类型
        System.out.println(first.getClass());
        //声明顺序
        System.out.println(first.ordinal());
        //生成数组
        Ex01[] values = Ex01.values();
        for (Ex01 value : values) {
            System.out.print(value+" ");
        }

    }
}

