package _4._6;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author ChenMingYang
 * @Date 2021-08-20 16:41
 */

public class Sets {
    /**
     * 并集
     * @param a
     * @param b
     * @param <T>
     * @return
     */
    public static <T> Set<T> union(Set<T> a, Set<T> b) {
        HashSet<T> result = new HashSet<>(a);
        result.addAll(b);
        return result;
    }

    /**
     * 交集
     * @param a
     * @param b
     * @param <T>
     * @return
     */
    public static <T> Set<T> intersection(Set<T> a, Set<T> b) {
        HashSet<T> result = new HashSet<>(a);
        result.retainAll(b);
        return result;
    }

    /**
     * 移除前者中包含后者的部分
     * @param a
     * @param b
     * @param <T>
     * @return
     */
    public static <T> Set<T> difference(Set<T> a, Set<T> b) {
        HashSet<T> ts = new HashSet<>(a);
        ts.removeAll(b);
        return ts;
    }

    public static <T> Set<T> complement(Set<T> a, Set<T> b) {
        return difference(union(a, b), intersection(a, b));
    }


}
