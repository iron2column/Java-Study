package _9_散列与散列码._2_为速度而散列;

import _2_填充容器._3_Abstract类.Countries;

/**
 * @Author ChenMingYang
 * @Date 2021-10-02 14:15
 */

public class Ex21 {
    public static void main(String[] args) {
        SimpleHashMap<String, String> m = new SimpleHashMap<>();
        m.putAll(Countries.capitals(Countries.DATA.length));
        m.put("HAITI","test1");
        m.put("HAITI","test1");
        m.put("HAITI","test1");
    }
}
