package _3.PetCount;

/**
 * @Author ChenMingYang
 * @Date 2021-08-08 10:32
 */

import _3.Pet;
import _3.PetCreator.LiteralPetCreator;
import _3.Pets.Pets;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 重写PetCount
 */
public class PetCount3 {

    static class PetCounter extends LinkedHashMap<Class<? extends Pet>, Integer> {
        public PetCounter() {
            super(extracted());
        }

        private static Map extracted() {
            List<Class<? extends Pet>> allTypes = LiteralPetCreator.allTypes;
            Map<Class<? extends Pet>, Integer> map = new LinkedHashMap<>();
            for (Class<? extends Pet> type : allTypes) {
                map.put(type, 0);
            }
            return map;
        }

        public void count(Pet pet) {
            for (Map.Entry<Class<? extends Pet>, Integer> pair : entrySet()) {
                if (pair.getKey().isInstance(pet)) {
                    put(pair.getKey(), pair.getValue() + 1);
                }
            }
        }

        public String toString() {
            StringBuilder result = new StringBuilder("{");
            for (Map.Entry<Class<? extends Pet>, Integer> pair : entrySet()) {
                result.append(pair.getKey().getSimpleName());
                result.append("=");
                result.append(pair.getValue());
                result.append(", ");
            }
            result.delete(result.length() - 2, result.length());
            result.append("}");
            return result.toString();
        }

        public static void main(String[] args) {
            PetCounter petCounter = new PetCounter();
            for (Pet pet : Pets.createArray(20)) {
                System.out.print(pet.getClass().getSimpleName() + " ");
                petCounter.count(pet);
            }
            System.out.println();
            System.out.println(petCounter);
        }

    }

}
