package _8_理解Map._3_LinkedHashMap;

import net.mindview.util.CountingMapData;

import java.util.LinkedHashMap;

/**
 * @Author ChenMingYang
 * @Date 2021-09-29 13:32
 */

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedMap = new LinkedHashMap<>(new CountingMapData(9));
        System.out.println(linkedMap.toString());
        linkedMap = new LinkedHashMap<Integer, String>(16, 0.75f, true);
        linkedMap.putAll(new CountingMapData(9));
        System.out.println(linkedMap);
        for (int i = 0; i < 6; i++) {
            //访问前五个元素
            linkedMap.get(i);
        }
        System.out.println(linkedMap);//再次打印发现打印顺序变了
        linkedMap.get(0);
        System.out.println(linkedMap);
    }
}
