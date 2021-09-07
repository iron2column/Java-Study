import java.util.Arrays;

/**
 * @Author ChenMingYang
 * @Date 2021-09-02 15:46
 */

public class ArrayOptions {
    public static void main(String[] args) {
        _7._1.BerylliumSphere[] a;

        _7._1.BerylliumSphere[] b = new _7._1.BerylliumSphere[5];
        System.out.println("b: " + Arrays.toString(b));

        _7._1.BerylliumSphere[] c = new _7._1.BerylliumSphere[4];
        for (int i = 0; i < c.length; i++) {
            if (c[i] == null) {
                c[i] = new _7._1.BerylliumSphere();
            }
        }
        _7._1.BerylliumSphere[] d = {new _7._1.BerylliumSphere(),
                new _7._1.BerylliumSphere(), new _7._1.BerylliumSphere()};

        a = new _7._1.BerylliumSphere[]{new _7._1.BerylliumSphere(), new _7._1.BerylliumSphere()};
        System.out.println("a.length = " + a.length);
        System.out.println("b.length = " + b.length);
        System.out.println("c.length = " + c.length);
        System.out.println("d.length = " + d.length);
        a = b;
        System.out.println(Arrays.toString(a));

        char[] chars = new char[4];
        System.out.println("Arrays.toString(chars) = " + chars[0]);
    }
}
