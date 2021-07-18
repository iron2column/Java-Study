import java.io.Serializable;
import java.util.ArrayList;

/**
 * @Author ChenMingYang
 * @Date 2021-07-17 15:37
 */
class Apple implements Serializable {


    private static long counter;
    private final long id = counter++;

    public long id() {
        return id;
    }
}

class Orange {

}
//使用ArrayList,但没有使用范型
public class Ex01 {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList apple = new ArrayList();

        for (int i = 0; i < 3; i++) {
            apple.add(new Apple());
        }
        //这里添加的类型导致下面进行类型转换时错误
        apple.add(new Orange());

        //报错处
        for (int i = 0; i < apple.size(); i++) {
            System.out.println(((Apple) apple.get(i)).id());
        }


        for (int i = 0; i < apple.size(); i++) {
            if (apple.get(i) instanceof Apple) {
                System.out.println(((Apple) apple.get(i)).id());
            } else {
                System.out.println(apple.get(i).getClass());
            }
        }

    }
}

//使用ArrayList,并使用范型
class Ex01_1 {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }
        //!apples.add(new Orange());

        for (int i = 0; i < apples.size(); i++) {
            //不再需要类型转换
            Apple apple = apples.get(i);
            System.out.println(apple.id());
        }

        //不需要索引的情况下，使用foreach遍历
        for (Apple apple : apples) {
            System.out.println(apple.id());
        }


    }
}
