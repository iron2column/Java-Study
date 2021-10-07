package _10_选择接口的不同实现._1_性能测试框架;

/**
 * @Author ChenMingYang
 * @Date 2021-10-03 23:45
 */

public class TestParam {
    /**
     * 尺寸
     */
    public final int size;
    /**
     * 循环次数
     */
    public final int loops;

    public TestParam(int size, int loops) {
        this.size = size;
        this.loops = loops;
    }

    public static TestParam[] array(int... values) {
        int size = values.length / 2;
        TestParam[] result = new TestParam[size];
        int n = 0;
        for (int i = 0; i < size; i++) {
            result[i] = new TestParam(values[n++], values[n++]);
        }
        return result;
    }

    public static TestParam[] array(String[] values) {
        int[] vals = new int[values.length];
        for (int i = 0; i < vals.length; i++) {
            vals[i] = Integer.decode(values[i]);
        }
        return array(vals);
    }
}
