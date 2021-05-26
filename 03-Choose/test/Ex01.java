/**
 * @Author ChenMingYang
 * @Date 2021-05-25 12:37
 */

public class Ex01 {
    public static void main(String[] args) {

        outer:
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            iner:
            for (int j = 0; j < 3; j++) {
                if (i == 3 && j == 1) {
                    continue outer;
                }
            }
        }


    }

    static void fun() {
        System.out.println("hi");

    }
}
