package _7;

import java.util.ArrayList;

/**
 * @Author ChenMingYang
 * @Date 2021-08-25 12:41
 */

public class GenericInstanceof {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<Integer> integers = new ArrayList<>();
        if (strings instanceof ArrayList) {
            System.out.println("true");
        }
    }
}
