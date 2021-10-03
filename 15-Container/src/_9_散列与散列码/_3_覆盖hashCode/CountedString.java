package _9_散列与散列码._3_覆盖hashCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author ChenMingYang
 * @Date 2021-10-02 23:30
 */

public class CountedString {
    /**
     * 因为static的缘故，created可当作全局的变量使用
     */
    private static List<String> created = new ArrayList<String>();
    private String s;
    private int id = 0;

    public CountedString(String s) {
        this.s = s;
        created.add(s);
        for (String s2 : created) {
            if (s2.equals(s)) {
                id++;
            }
        }
    }

    @Override
    public String toString() {
        return "【String=" + s + " id=" + id + " hashCode()" + hashCode()+"】";
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof CountedString &&
                s.equals(((CountedString) o).s) &&
                id == ((CountedString) o).id;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 37 * result + s.hashCode();
        result = 37 * result + id;
        return result;
    }

    public static void main(String[] args) {
        Map<CountedString, Integer> map = new HashMap<>();
        CountedString[] cs = new CountedString[5];
        for (int i = 0; i < cs.length; i++) {
            cs[i] = new CountedString("hi");
            map.put(cs[i],i);
        }
        System.out.println(map);

        for (CountedString cstring : cs) {
            System.out.println("查找 " + cstring);
            System.out.println(map.get(cstring));
        }
    }
}
