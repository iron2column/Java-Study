package _3.PetCount;

import _3.*;
import _3.PetCreator.ForNameCreator;
import _3.PetCreator.PetCreator;

import java.util.HashMap;

/**
 * @Author ChenMingYang
 * @Date 2021-08-07 17:22
 */

public class PetCount {

    public static void countPets(PetCreator creator) {
        PetCounter counter = new PetCounter();

        for (Pet pet : creator.createArray(20)) {
            System.out.print(pet.getClass().getSimpleName() + " ");
            if (pet instanceof Pet) {
                counter.count("Pet");
            }
            if (pet instanceof Dog) {
                counter.count("Dog");
            }
            if (pet instanceof Mutt) {
                counter.count("Mutt");
            }
            if (pet instanceof Pug) {
                counter.count("Pug");
            }
            if (pet instanceof Cat) {
                counter.count("Cat");
            }
            if (pet instanceof Manx) {
                counter.count("Manx");
            }
            if (pet instanceof EgyptianMau) {
                counter.count("EgyptianMau");
            }
            if (pet instanceof Cymric) {
                counter.count("Cymric");
            }
            if (pet instanceof Mouse) {
                counter.count("Mouse");
            }
            if (pet instanceof Hamster) {
                counter.count("Hamster");
            }
            if (pet instanceof Rodent) {
                counter.count("Rodent");
            }
            if (pet instanceof Rat) {
                counter.count("Rat");
            }
            System.out.println();
            System.out.println(counter);
        }
    }

    /**
     * 内部类：为什么要继承HashMap?
     */
    static class PetCounter extends HashMap<String, Integer> {
        public void count(String type) {
            Integer quantity = get(type);
            if (quantity == null) {
                put(type, 1);
            } else {
                put(type, quantity + 1);
            }
        }
    }

    public static void main(String[] args) {
        countPets(new ForNameCreator());
    }

}
