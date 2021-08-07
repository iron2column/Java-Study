package _3.PetCreator;

import _3.Pet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @Author ChenMingYang
 * @Date 2021-08-07 16:44
 */

public abstract class PetCreator {
    private Random rand = new Random(47);

    /**
     * 获取所有动物类型的列表集
     *
     * @return
     */
    public abstract List<Class<? extends Pet>> types();

    /**
     * 获取一个Pet子类类型的实例
     * @return
     */
    public Pet randomPet() {
        //获取动物类型数量范围内的随机某类型
        int n = rand.nextInt(types().size());
        try {
            return types().get(n).newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 获取指定数量的Pet类型数组集
     * @param size
     * @return
     */
    public Pet[] createArray(int size) {
        Pet[] result = new Pet[size];
        for (int i = 0; i < size; i++) {
            result[i] = randomPet();
        }
        return result;
    }

    /**
     * 利用createArray生成的数组转换成一个ArrayList
     * @param size
     * @return
     */
    public ArrayList<Pet> arrayList(int size) {
        ArrayList<Pet> result = new ArrayList<>();
        Collections.addAll(result, createArray(size));
        return result;
    }
}
