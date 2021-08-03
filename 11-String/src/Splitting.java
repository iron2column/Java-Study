import java.util.Arrays;

/**
 * @Author ChenMingYang
 * @Date 2021-07-27 15:40
 */

public class Splitting {
    public static String knights =
            "Then, when you have found the found the shrubbery, you must " +
                    "cut down the mightiest tree in the forest... " +
                    "with... a herring!";

    public static void split(String regex) {
        System.out.println(
                Arrays.toString(knights.split(regex)));
    }

    public static void main(String[] args) {
        split(" ");
        split("\\W+");
        split("n\\W+");


    }
}
