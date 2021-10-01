package _9_散列与散列码._2_为速度而散列;

import _2_填充容器._3_Abstract类.Countries;
import _9_散列与散列码._1_理解hashCode.MapEntry;

import java.util.*;

/**
 * @Author ChenMingYang
 * @Date 2021-10-01 12:12
 */

public class SimpleHashMap<K, V> extends AbstractMap<K, V> {
    //选择一个主要的数字作为hash表的尺寸，
    //以达到均匀分布
    static final int SIZE = 997;

    //你不能有一个物理的泛型数组
    //但是你可以向上转型一个
    @SuppressWarnings("unchecked")
    LinkedList<MapEntry<K, V>>[] buckets = new LinkedList[SIZE];

    public V put(K key, V value) {
        boolean isConflict = true;

        V oldValue = null;
        int index = Math.abs(key.hashCode()) % SIZE;

        //如果是新的索引，再新new一个List以备存放键的信息
        if (buckets[index] == null) {
            buckets[index] = new LinkedList<MapEntry<K, V>>();
            isConflict = false;
        }
        if (isConflict) {
            System.out.println("【冲突警告】: "+key+" 已经存在!");
        }
        //如果不是新的就不会经过上面而是直接获取List进行操作
        LinkedList<MapEntry<K, V>> bucket = buckets[index];

        //用来准备插入
        MapEntry<K, V> pair = new MapEntry<>(key, value);

        boolean found = false;
        //通过遍历器去遍历List，所以获取该List的遍历器
        ListIterator<MapEntry<K, V>> it = bucket.listIterator();

        while (it.hasNext()) {
            MapEntry<K, V> iPair = it.next();
            if (iPair.getKey().equals(key)) {
                oldValue = iPair.getValue();
                it.set(pair);
                found = true;
                break;
            }
        }
        if (!found) {
            buckets[index].add(pair);
        }
        return oldValue;
    }

    public V get(Object key) {
        int index = Math.abs(key.hashCode()) % SIZE;
        if (buckets[index] == null) {
            return null;
        }
        for (MapEntry<K, V> iPair : buckets[index]) {
            if (iPair.getKey().equals(key)) {
                return iPair.getValue();
            }
        }
        return null;
    }

    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> set = new HashSet<>();
        for (LinkedList<MapEntry<K, V>> bucket : buckets) {
            if (bucket == null) {
                //数组里某些可能还为null，
                //对于这一部分的内容可以跳过去下一个
                continue;
            }
            for (MapEntry<K, V> mpair : bucket) {
                //把那些不为null的list集中到一个Set里
                set.add(mpair);
            }
        }
        return set;
    }

    public static void main(String[] args) {
        SimpleHashMap<String, String> m = new SimpleHashMap<>();
        m.putAll(Countries.capitals(25));
        System.out.println(m);
        System.out.println(m.get("ERITREA"));
        System.out.println(m.entrySet());
    }

}
