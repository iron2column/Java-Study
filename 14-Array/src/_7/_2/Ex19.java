package _7._2;

import java.util.Arrays;
import java.util.Objects;

/**
 * @Author ChenMingYang
 * @Date 2021-09-07 17:29
 */
class ArrayEx19 {
    public int anInt;

    public ArrayEx19(int anInt) {
        this.anInt = anInt;
    }

    //事关对象之间是否相等
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayEx19 arrayEx19 = (ArrayEx19) o;
        return anInt == arrayEx19.anInt;
    }

    @Override
    public int hashCode() {
        return Objects.hash(anInt);
    }
}
public class Ex19 {
    public static void main(String[] args) {
        ArrayEx19[] a1 = new ArrayEx19[4];
        ArrayEx19[] a2 = new ArrayEx19[4];
        Arrays.fill(a1, new ArrayEx19(47));
        Arrays.fill(a2, new ArrayEx19(47));
        Arrays.equals(a1, a2);
        System.out.println("Arrays.equals(a1, a2) = " + Arrays.equals(a1, a2));
    }
}
