package _4;

import _4._6.Sets;

import java.lang.reflect.Method;
import java.util.*;

/**
 * @Author ChenMingYang
 * @Date 2021-08-20 19:11
 */

public class ContainerMethodDifferences {
    /**
     *
     * @param type
     * @return
     */
    static Set<String> methodSet(Class<?> type) {
        TreeSet<String> result = new TreeSet<>();
        for (Method m : type.getMethods()) {
            result.add(m.getName());
        }
        //System.out.println(result);
        return result;
    }

    static void interfaces(Class<?> type) {
        System.out.printf("Interfaces in " + type.getSimpleName() + ": ");
        List<String> result = new ArrayList<String>();

        for (Class<?> c : type.getInterfaces()) {
            result.add(c.getSimpleName());
        }
    }

    static Set<String> object = methodSet(Object.class);

    static {object.add("clone");}

    static void difference(Class<?> superset, Class<?> subset) {
        System.out.print(superset.getSimpleName() + " extends " + subset.getSimpleName() + ", adds: ");
        Set<String> comp = Sets.difference(methodSet(superset), methodSet(subset));
        comp.removeAll(object);
        System.out.println(comp);
        interfaces(superset);

    }

    public static void main(String[] args) {

        System.out.println("Collection: " + methodSet(Collection.class));
        interfaces(Collection.class);

        difference(Set.class, Collection.class);
        difference(HashSet.class, Set.class);
        difference(LinkedHashSet.class, HashSet.class);

    }


}
