import java.util.*;

/**
 * @Author ChenMingYang
 * @Date 2021-07-20 09:04
 */

public class Ex08 {
    public static void main(String[] args) {
        List<Integer> first_List = new ArrayList<>();
        Collections.addAll(first_List, 1, 2, 3, 4, 5);

        List<Integer> second_List = new ArrayList<>(first_List.size());

        ListIterator<Integer> iterator = first_List.listIterator(first_List.size());

        while (iterator.hasPrevious()) {
            second_List.add(iterator.previous());
        }

        System.out.println(first_List);
        System.out.println(second_List);
    }
}
