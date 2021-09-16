package _7;

import _6._3.Generated;
import _7._3.CompType;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author ChenMingYang
 * @Date 2021-09-16 15:52
 */
class CompTypeComparator implements Comparator<CompType> {
    @Override
    public int compare(CompType o1, CompType o2) {
        return (o1.j < o2.j ? -1 : (o1.j == o2.j ? 0 : 1));
    }
}

public class ComparatorTest {
    public static void main(String[] args) {
        CompType[] a = Generated.array(new CompType[12], CompType.generator());
        System.out.println("Arrays.toString(a) = " + Arrays.toString(a));
        Arrays.sort(a, new CompTypeComparator());
        System.out.println("Arrays.toString(a) = " + Arrays.toString(a));

    }
}
