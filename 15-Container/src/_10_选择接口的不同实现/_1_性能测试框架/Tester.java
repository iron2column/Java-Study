package _10_选择接口的不同实现._1_性能测试框架;

import java.util.List;

/**
 * @Author ChenMingYang
 * @Date 2021-10-04 08:57
 */

public class Tester<C> {

    public static int fieldWidth = 8;
    private static int sizeWidth = 5;
    /**
     * 输出结果的格式化字符串
     * @return
     */
    private static String stringField() {
        return "%" + fieldWidth + "s";
    }
    /**
     * 输出结果的格式化字符串
     * @return
     */
    private static String numberField() {
        return "%" + fieldWidth + "d";
    }
    private static String sizeField = "%" + sizeWidth + "s";
    /**
     * 预备表头对象
     */
    private String headline = "";
    /**
     * 手动设置表头，如果没有手动设置则会默认使用容器的类名
     * @param newHeadLine
     */
    public void setHeadline(String newHeadLine) {
        headline = newHeadLine;
    }

    // ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓
    /**
     * 容器类型
     */
    protected C container;
    /**
     * ？？？
     * @param size
     * @return
     */
    protected C initialize(int size) {
        return container;
    }
    //------------
    /**
     * 预备测试集合List
     */
    private List<Test<C>> tests;
    //------------
    private TestParam[] paramList = defaultParams;
    /**
     * 默认TestParam数组
     */
    public static TestParam[] defaultParams = TestParam.array(10, 5000, 100, 5000, 1000, 5000, 5000, 10000, 500);
    //------------
    /**
     * 测试器构造器
     * @param container C
     * @param tests List[{@link Test}]
     */
    public Tester(C container, List<Test<C>> tests) {
        this.container = container;
        this.tests = tests;
        if (container != null) {
            headline = container.getClass().getSimpleName();
        }
    }
    /**
     * 测试器构造器
     * @param container C
     * @param tests List<{@link Test}>
     * @param paramList {@link TestParam}[]
     */
    public Tester(C container, List<Test<C>> tests, TestParam[] paramList) {
        this(container, tests);
        this.paramList = paramList;
    }
    // ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑

    /**
     * 快速进行测试
     * @param cntnr C
     * @param tests List<{@link Test}>
     */
    public static <C> void run(C cntnr, List<Test<C>> tests) {
        new Tester<C>(cntnr, tests).timedTest();
    }
    /**
     * 快速进行测试
     * @param cntnr C
     * @param tests List<{@link Test}>
     * @param paramList {@link TestParam}[]
     */
    public static <C> void run(C cntnr, List<Test<C>> tests, TestParam[] paramList) {
        new Tester<C>(cntnr, tests, paramList).timedTest();
    }

    /**
     * 打印输出显示
     */
    public void displayHeader() {
        int width = fieldWidth * tests.size() + sizeWidth;
        int dashLength = width - headline.length() - 1;
        StringBuilder head = new StringBuilder(width);
        for (int i = 0; i < dashLength / 2; i++) {
            head.append('-');
        }
        head.append(' ');
        head.append(headline);
        head.append(' ');
        for (int i = 0; i < dashLength / 2; i++) {
            head.append('-');
        }
        System.out.println(head);
        System.out.format(stringField(), "size");
        for (Test test : tests) {
            System.out.format(stringField(), test.name);
        }
        System.out.println();

    }

    public void timedTest() {
        displayHeader();
        for (TestParam param : paramList) {
            System.out.format(stringField(), param.size);
            for (Test<C> test : tests) {
                C kontainer = initialize(param.size);
                long start = System.nanoTime();
                int reps = test.test(kontainer, param);
                long duration = System.nanoTime() - start;
                long timePerRep = duration / reps;
                System.out.format(numberField(), timePerRep);
            }
            System.out.println();
        }
    }
}
