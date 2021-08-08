package _3.PetCreator;

import _3.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author ChenMingYang
 * @Date 2021-08-07 17:57
 */

public class LiteralPetCreator extends PetCreator {

    public static final List<Class<? extends Pet>> allTypes =
            Collections.unmodifiableList(
                    Arrays.asList(
                            Pet.class, Dog.class, Cat.class, Rodent.class,
                            Mutt.class, Pug.class, EgyptianMau.class, Cymric.class, Rat.class, Hamster.class, Mouse.class, Gerbil.class
                    )
            );

    private static final List types =
            allTypes.subList(
                    allTypes.indexOf(Mutt.class),
                    allTypes.size()
            );

    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }

}
