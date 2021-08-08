package _3.PetCount;

import _3.Pet;
import _3.Pets.Pets;

/**
 * @Author ChenMingYang
 * @Date 2021-08-08 15:52
 */

public class PetCount4 {
    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Pet.class);
        for (Pet pet : Pets.createArray(20)) {
            counter.count(pet);
        }
        System.out.println(counter);
    }
}
