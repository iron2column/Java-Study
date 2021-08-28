package _9;

/**
 * @Author ChenMingYang
 * @Date 2021-08-28 14:57
 */
interface SuperPower {
}

interface XRayVision extends SuperPower {
    void seeThroughWalls();
}

interface SuperHearing extends SuperPower {
    void hearSubtleNoises();
}

interface SuerSmell extends SuperPower {
    void trackBySmell();
}

//---------------------------------------------------------------
class SuperHero<POWER extends SuperPower> {
    POWER power;

    SuperHero(POWER power) {
        this.power = power;
    }

    POWER getPower() {
        return power;
    }
}

class SuperSleuth<POWER extends XRayVision>
        extends SuperHero<POWER> {

    SuperSleuth(POWER power) {
        super(power);
    }

    void see() {
        power.seeThroughWalls();
    }
}

class CanineHero<POWER extends SuperHearing & SuerSmell>
        extends SuperHero<POWER> {

    CanineHero(POWER power) {
        super(power);
    }

    void hear() {
        power.hearSubtleNoises();
    }

    void smell() {
        power.trackBySmell();
    }
}

//---------------------------------------------------------------
class SuperHearSmell implements SuperHearing, SuerSmell {

    public void hearSubtleNoises() {

    }

    public void trackBySmell() {

    }

}

//---------------------------------------------------------------
class DogBoy extends CanineHero<SuperHearSmell> {

    DogBoy() {
        super(new SuperHearSmell());
    }

}

public class EpicBattle {
    static <POWER extends SuperHearing> void useSuperHearing(SuperHero<POWER> hero) {
        hero.getPower().hearSubtleNoises();
    }

    static <POWER extends SuperHearing & SuerSmell> void superFind(SuperHero<POWER> hero) {
        hero.getPower().trackBySmell();
        hero.getPower().hearSubtleNoises();
    }

    public static void main(String[] args) {
        DogBoy dogBoy = new DogBoy();

        useSuperHearing(dogBoy);
        superFind(dogBoy);

    }
}
