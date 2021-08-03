import java.util.Formatter;

/**
 * @Author ChenMingYang
 * @Date 2021-07-26 17:27
 */

public class Conversion {
    private static Formatter f = new Formatter(System.out);

    public static void main(String[] args) {
        String t = "[char v]转换成";

        char u = 'a';
        System.out.println("char v = 'a'");
        //基本类型转换
        f.format("%s s: %s\n", t, u);
        //!f.format("转换成d: %d\n", v);
        f.format("%s c: %c\n", t, u);
        f.format("%s b: %b\n", t, u);
        //!f.format("%s f: %f\n", t, v);
        //!f.format("%s e: %e\n", t, v);
        //!f.format("%s x: %x\n", t, v);
        f.format("%s h: %h\n\n", t, u);


        int v = 121;
        System.out.println("int v = 121;");
        f.format("s: %s\n", v);
        f.format("d: %d\n", v);
        f.format("c: %c\n", v);
        f.format("b: %b\n", v);
//        f.format("f: %f\n", v);
//        f.format("e: %e\n", v);
        f.format("x: %x\n", v);
        f.format("h: %h\n\n", v);

    }
}
