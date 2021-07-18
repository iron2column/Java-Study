import java.util.*;

/**
 * @Author ChenMingYang
 * @Date 2021-07-18 12:16
 */
class Ex041 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            set.add(i);
        }
        set.add(null);
        for (Integer integer : set) {
            System.out.println(integer);
        }



    }

}
public class Ex04 {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            collection.add(i);
        }
        for (Integer integer : collection) {
            System.out.print(integer);
        }
    }

}
