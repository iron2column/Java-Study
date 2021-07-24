import java.util.Map;

/**
 * @Author ChenMingYang
 * @Date 2021-07-23 21:15
 */

public class Ex19 {
    public static void main(String[] args) {
        for (Map.Entry<String, String> entry : System.getenv().entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
