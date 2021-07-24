import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

/**
 * @Author ChenMingYang
 * @Date 2021-07-23 18:18
 */

public class Ex17 {
    public static void main(String[] args) {

        Collection<String> cs = new LinkedList<>();
        Collections.addAll(cs,
                "Take the long way home".split(" "));
        for (String c : cs) {
            System.out.print("'"+c+"' ");
        }

    }

}
