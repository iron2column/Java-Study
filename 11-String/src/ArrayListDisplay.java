import java.util.ArrayList;

/**
 * @Author ChenMingYang
 * @Date 2021-07-26 11:58
 */

public class ArrayListDisplay {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(list);
        String s = list.toString();
        System.out.println(s);
    }
}
