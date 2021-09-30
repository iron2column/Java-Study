package _8_理解Map._2_SortedMap;

import net.mindview.util.CountingMapData;

import java.util.Iterator;
import java.util.TreeMap;

/**
 * @Author ChenMingYang
 * @Date 2021-09-29 12:06
 */

public class SortedSetDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> sortedMap = new TreeMap<>(new CountingMapData(10));
        System.out.println(sortedMap);
        Integer low = sortedMap.firstKey();
        Integer high = sortedMap.lastKey();
        System.out.println(low);
        System.out.println(high);
        Iterator<Integer> it = sortedMap.keySet().iterator();
        for (int i = 0; i <= 6; i++) {
            if (i==3) low = it.next();
            if (i==6) high = it.next();
            else it.next();
        }

        System.out.println(sortedMap.subMap(low, high));

        System.out.println(sortedMap.headMap(low));
        System.out.println(sortedMap.headMap(high));

        System.out.println(sortedMap.tailMap(high,false));
        System.out.println(sortedMap.tailMap(high,true));
    }

}
