package _2;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Author ChenMingYang
 * @Date 2021-08-14 10:13
 */

public class RandomList<T> {
    private ArrayList<T> storage = new ArrayList<T>();
    private Random random = new Random(47);

    public T select() {
        int size = storage.size();
        int randomNum = random.nextInt(size);
        T result = storage.get(randomNum);
        return result;
    }

    public void add(T item) {
        storage.add(item);
    }

    public static void main(String[] args) {
        RandomList<String> randomList = new RandomList<>();
        for (String s : "我得熟悉 这种 遍历方式".split(" ")) {
            randomList.add(s);
        }
        for (int i = 0; i < 11; i++) {
            System.out.println(randomList.select());
        }
    }
}
