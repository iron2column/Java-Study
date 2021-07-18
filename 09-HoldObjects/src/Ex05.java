import java.util.*;

/**
 * @Author ChenMingYang
 * @Date 2021-07-18 13:05
 */

public class Ex05 {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));


        Integer[] moreInts = {6, 7, 8, 9, 10};
        collection.addAll(Arrays.asList(moreInts));

        Collections.addAll(collection, 11, 12, 13, 14, 15);
        Collections.addAll(collection, moreInts);

        //查看asList的返回类型的源码可发现不同
        List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);
        System.out.println(list);
        list.set(1, 99);
        System.out.println(list);


    }
}
