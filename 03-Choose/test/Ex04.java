import java.util.Arrays;

/**
 * @Author ChenMingYang
 * @Date 2021-05-26 11:05
 */

public class Ex04 {
    public static void main(String[] args) {
    }

    private static void fun() {
        for (int i = 1000 ; i <10000 ; i++) {

            int[] no = new int[4];
            int subject = i;

            eachOne(no,subject);//1 2 6 0



        }
    }

    public static void eachOne(int[] eachno,int subject) {
        String string_subject = "" + subject;
        String[] split = (subject + "").split("");
        for (int i = 0; i < 4; i++) {
            eachno[i] = Integer.parseInt(split[i]);
        }
    }

}
