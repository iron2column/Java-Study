import java.util.Random;

/**
 * @Author ChenMingYang
 * @Date 2021-05-24 14:22
 */

public class Ex04 {
    public static void main(String[] args) {

        int coun = 0;
        for (int i = 0; i <10; i++) {
            if (new Random().nextBoolean()) {
                coun++;
                System.out.println("正面");
            } else {
                System.out.println("反面");
            }
        }
        System.out.println("正面次数="+coun+" 反面次数="+(10-coun));
    }
}
