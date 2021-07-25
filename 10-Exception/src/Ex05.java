/**
 * @Author ChenMingYang
 * @Date 2021-07-25 17:22
 */

public class Ex05 {
    public static void main(String[] args) {
        int[] ints = new int[4];

        try {
            System.out.println(ints[5]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
