package _9_散列与散列码._2_为速度而散列;

import _2_填充容器._3_Abstract类.Countries;

/**
 * @Author ChenMingYang
 * @Date 2021-10-02 00:23
 */

public class Ex20 {
    public static void main(String[] args) {
        SimpleHashMap<String, String> m = new SimpleHashMap<>();
        m.putAll(Countries.capitals(5));
        System.out.println(m);
        m.put("ANGOLA","Luanda");
        m.putAll(Countries.capitals(10));
        System.out.println(m);
    }
}
