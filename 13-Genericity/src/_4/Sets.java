package _4;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author ChenMingYang
 * @Date 2021-08-20 16:41
 */

public class Sets {
    public static <T> Set<T> union(Set<T> a, Set<T> b) {
        HashSet<T> result = new HashSet<>(a);
        result.addAll(b);
        return result;
    }

    public static <T> Set<T> intersection(Set<T> a, Set<T> b) {
        HashSet<T> result = new HashSet<>(a);
        result.retainAll(b);
        return result;
    }

    public static <T> Set<T> difference(Set<T> a, Set<T> b) {
        HashSet<T> ts = new HashSet<>(a);
        ts.removeAll(b);
        return ts;
    }
}
