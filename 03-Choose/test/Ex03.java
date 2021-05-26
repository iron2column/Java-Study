/**
 * @Author ChenMingYang
 * @Date 2021-05-26 10:48
 */

public class Ex03 {
    public static void main(String[] args) {
        int arg = Integer.parseInt(args[0]);

        fun(arg);

    }

    public static void fun(int no) {
        int[] fb = new int[no];
        for (int i = 0; i < fb.length; i++) {
            if (i == 0) {
                fb[i] = 1;
                continue;
            }
            if (i == 1) {
                fb[i] = 1;
                continue;
            }
            fb[i] = fb[i - 1] + fb[i - 2];
        }
        for (int i : fb) {
            System.out.println(i);
        }
    }
}
