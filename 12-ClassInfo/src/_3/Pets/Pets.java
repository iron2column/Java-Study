package _3.Pets;

import _3.Pet;
import _3.PetCreator.LiteralPetCreator;
import _3.PetCreator.PetCreator;

import java.util.ArrayList;

/**
 * @Author ChenMingYang
 * @Date 2021-08-07 20:58
 */

public class Pets {
    public static final PetCreator creator = new LiteralPetCreator();

    public static Pet randomPet() {
        return creator.randomPet();
    }

    public static Pet[] createArray(int size) {
        return creator.createArray(size);
    }

    public static ArrayList<Pet> arrayList(int size) {
        return creator.arrayList(size);
    }


}
