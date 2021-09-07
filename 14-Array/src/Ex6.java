import java.util.Arrays;

/**
 * @Author ChenMingYang
 * @Date 2021-09-03 21:47
 */

public class Ex6 {
    public static _7._1.BerylliumSphere[][] sphereAM(int size1, int size2) {
        _7._1.BerylliumSphere[][] result = new _7._1.BerylliumSphere[size1][size2];
        for(int i = 0; i < size1; i++) {
            result[i] = new _7._1.BerylliumSphere[size2];
            for(int j = 0; j < size2; j++)
                result[i][j] = new _7._1.BerylliumSphere();
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(sphereAM(2,2)));
        System.out.println(Arrays.deepToString(sphereAM(4,3)));
    }
}
