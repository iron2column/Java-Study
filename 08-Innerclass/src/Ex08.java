import java.lang.reflect.Field;

/**
 * @Author ChenMingYang
 * @Date 2021-07-04 11:40
 */

public class Ex08 {
    public String name;
    public String name() {
        System.out.println(getClass().getName());
        Field[] declaredFields = getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        return getClass().getSimpleName();
    }
    public static void main(String[] args) {
        new Ex08().name();
    }
}
