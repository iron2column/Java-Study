import java.util.ArrayList;
import java.util.List;

/**
 * @Author ChenMingYang
 * @Date 2021-07-18 09:44
 */

public class Ex03 {
    public static void main(String[] args) {
        //转型的变化是看引用，而根本在于所指向的对象⬇
        ArrayList<Apple> apples = new ArrayList<>();

        //此之谓向上转型也，引用者为子类，更为父类
        List list = apples;

        //此之谓向下转型也，引用者为父类，更为子类
        ArrayList arrayList = (ArrayList) list;

        //更来更去，内核为之不变，其对象仍子类也
        //然内核为父类，则不可更矣！


    }
}
