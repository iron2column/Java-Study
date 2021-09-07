import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author ChenMingYang
 * @Date 2021-09-02 15:01
 */
class BerylliumSphere {
    private static long counter;
    private final long id = counter++;
    public String toString() {
        return "Sphere " + id;
    }
}

public class ContainerComparison {
    public static void main(String[] args) {
        _7._1.BerylliumSphere[] spheres = new _7._1.BerylliumSphere[10];

        System.out.println(Arrays.toString(spheres));
        System.out.println(spheres[4]);


        List<_7._1.BerylliumSphere> sphereList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            sphereList.add(new _7._1.BerylliumSphere());
        }
        System.out.println(sphereList);
        System.out.println(sphereList.get(4));


        List<Integer> intList = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5));
        intList.add(97);
        System.out.println(intList);
        System.out.println(intList.get(4));
    }
}
