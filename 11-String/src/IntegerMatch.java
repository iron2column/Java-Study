/**
 * @Author ChenMingYang
 * @Date 2021-07-27 14:42
 */

public class IntegerMatch {
    public static void main(String[] args) {
        String regex = "-?\\d+";
        System.out.println("-1234".matches(regex));//t
        System.out.println("5678".matches(regex));//t
        System.out.println("+911".matches(regex));//f
        regex = "(-|\\+)?\\d+";
        System.out.println("+911".matches(regex));//t
        System.out.println("+123".matches(regex));//t
        System.out.println("+123+".matches(regex));//f
    }
}
