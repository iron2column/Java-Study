import java.util.Arrays;

/**
 * @Author ChenMingYang
 * @Date 2021-09-03 18:31
 */

public class MultidimensionalObjectArrays {
    public static void main(String[] args) {
        _7._1.BerylliumSphere[][] spheres = {
                {new _7._1.BerylliumSphere(), new _7._1.BerylliumSphere()},
                {new _7._1.BerylliumSphere(), new _7._1.BerylliumSphere(),
                        new _7._1.BerylliumSphere(), new _7._1.BerylliumSphere()},
                {new _7._1.BerylliumSphere(), new _7._1.BerylliumSphere(),
                        new _7._1.BerylliumSphere(), new _7._1.BerylliumSphere(),
                        new _7._1.BerylliumSphere(), new _7._1.BerylliumSphere(),
                        new _7._1.BerylliumSphere(), new _7._1.BerylliumSphere()}
        };
        System.out.println(Arrays.deepToString(spheres));
    }
}
