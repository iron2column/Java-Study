/**
 * @Author ChenMingYang
 * @Date 2021-05-29 15:16
 */

class Plate {
    Plate(int i) {
        System.out.println("Plate constructor");
    }
}

class DinnerPlate extends Plate {

    DinnerPlate(int i) {
        super(i);
        System.out.println("DinnerPlate constructor");
    }
}

//-------------------------------------------------------

class Utensil {
    Utensil(int i) {
        System.out.println("Utensil constructor");
    }
}

class Spoon extends Utensil {
    Spoon(int i) {
        super(i);
        System.out.println("Spoon constructor");
    }
}

class Fork extends Utensil {
    Fork(int i) {
        super(i);
        System.out.println("Fork constructor");
    }
}

class Knife extends Utensil {
    Knife(int i) {
        super(i);
        System.out.println("Knife constructor");
    }
}
//-------------------------------------------------------

class Custom {
    public Custom(int i) {
        System.out.println("Custom constructor");
    }
}

class PlaceSetting extends Custom {

    //Utensil:Spoon Fork Knife
    private Spoon sp;
    private Fork frk;
    private Knife kn;

    //Plate:DinnerPlate
    private DinnerPlate dp;

    public PlaceSetting(int i) {
        super(i + 1);
            sp = new Spoon(i + 2);
            frk = new Fork(i + 3);
            kn = new Knife(i + 4);
            dp = new DinnerPlate(i + 5);
        System.out.println("PlaceSetting constructor");
    }
}
//-------------------------------------------------------

public class Ex06 {
    public static void main(String[] args) {
        PlaceSetting placeSetting = new PlaceSetting(9);
        /*output:
        Custom constructor

            Utensil constructor
            Spoon constructor

            Utensil constructor
            Fork constructor

            Utensil constructor
            Knife constructor

            Plate constructor
            DinnerPlate constructor

        PlaceSetting constructor
        */

    }
}
