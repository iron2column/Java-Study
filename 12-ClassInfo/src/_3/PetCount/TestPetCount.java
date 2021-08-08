package _3.PetCount;

import _3.Pet;
import _3.PetCreator.ForNameCreator;
import _3.PetCreator.PetCreator;
import _3.Pets.Pets;

/**
 * @Author ChenMingYang
 * @Date 2021-08-08 10:12
 */

public class TestPetCount {
    public static void main(String[] args) {

        PetCreator forNameCreator = new ForNameCreator();
        PetCount.countPets(forNameCreator);

        System.out.println("++++++++++");

        PetCreator literalPetCreator = Pets.creator;
        PetCount.countPets(literalPetCreator);
    }
}
