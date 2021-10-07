package _10_选择接口的不同实现._1_性能测试框架;

/**
 * @Author ChenMingYang
 * @Date 2021-10-03 23:38
 */

public abstract class Test<C> {
    String name;

    public Test(String name) {
        this.name = name;
    }

    abstract int test(C container, TestParam testParam);
}
