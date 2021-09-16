package _2._1;

import _6._2.RandomGenerator;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @Author ChenMingYang
 * @Date 2021-09-16 16:58
 */

public class CollectionDataGeneration {
    public static void main(String[] args) {
        System.out.println(new ArrayList<String>(CollectionData.list(new RandomGenerator.String(9), 10)));
        System.out.println(new HashSet<Integer>(new CollectionData<Integer>(new RandomGenerator.Integer(), 10)));

    }
}
