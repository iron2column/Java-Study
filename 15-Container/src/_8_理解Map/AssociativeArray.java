package _8_理解Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/**
 * @Author ChenMingYang
 * @Date 2021-09-28 00:29
 */

public class AssociativeArray<K, V> {
    private Object[][] pairs;
    private int index;

    public AssociativeArray(int length) {
        pairs = new Object[length][2];
    }

    public void put(K key, V value) {
        if (index >= pairs.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        pairs[index++] = new Object[]{key, value};
    }

    @SuppressWarnings("unchecked")
    public V get(K key) {
        //最低效率
        for (int i = 0; i < index; i++) {
            if (key.equals(pairs[i][0])) {
                return ((V) pairs[i][1]);
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < index; i++) {
            result.append(pairs[i][0].toString());
            result.append(" : ");
            result.append(pairs[i][1].toString());
            if (i < index - 1) {
                result.append("\n");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        AssociativeArray<String, String> map = new AssociativeArray<>(6);
        map.put("sky", "blue");
        map.put("grass", "green");
        map.put("ocean", "dancing");
        map.put("tree", "tall");
        map.put("earth", "brown");
        map.put("sun", "warm");
        try {
            map.put("extra", "object");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Too many objects!");
        }
        System.out.println(map);
        System.out.println(map.get("ocean"));
        System.out.println("----------------");
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("sky", "blue");
        map1.put("grass", "green");
        map1.put("ocean", "dancing");
        map1.put("tree", "tall");
        map1.put("earth", "brown");
        map1.put("sun", "warm");
        System.out.println(map1);
        System.out.println("----------------");
        TreeMap<String, String> map2 = new TreeMap<>();
        map2.put("sky", "blue");
        map2.put("grass", "green");
        map2.put("ocean", "dancing");
        map2.put("tree", "tall");
        map2.put("earth", "brown");
        map2.put("sun", "warm");
        System.out.println(map2);
        System.out.println("----------------");
        LinkedHashMap<String, String> map3 = new LinkedHashMap<>();
        map3.put("sky", "blue");
        map3.put("grass", "green");
        map3.put("ocean", "dancing");
        map3.put("tree", "tall");
        map3.put("earth", "brown");
        map3.put("sun", "warm");
        System.out.println(map3);
    }
}
