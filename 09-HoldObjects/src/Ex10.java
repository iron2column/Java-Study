import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

/**
 * @Author ChenMingYang
 * @Date 2021-07-22 12:59
 */

public class Ex10 {
    public static void main(String[] args) {

        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();


        Collections.addAll(set1, "A B C D E F G H I J K L".split(" "));
        Collections.addAll(set2,"H I J K L".split(" "));

        System.out.println("set1 = " + set1);
        System.out.println("set2 = " + set2);

        set1.add("M");

        System.out.println("H: " + set1.contains("H"));
        System.out.println("N: " + set1.contains("N"));

        System.out.println("set1.contains(set2) = " + set1.containsAll(set2));
        System.out.println("set2.contains(set1) = " + set2.containsAll(set1));

        System.out.println("set1 = " + set1);
    }
}
