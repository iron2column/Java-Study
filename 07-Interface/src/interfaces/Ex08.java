package interfaces;

/**
 * @Author ChenMingYang
 * @Date 2021-06-21 10:22
 */
enum CycleType {
    Unicycle,Bicycle,Tricycle
}

interface Cycle {
    int area();

}
//接口实现
class Unicycle implements Cycle {

    @Override
    public int area() {
        return 1;
    }

}
class Bicycle implements Cycle {
    @Override
    public int area() {
        return 2;
    }

}
class Tricycle implements Cycle {
    @Override
    public int area() {
        return 3;
    }

}

interface FactoryCycleInterface {
    Cycle getCycle();
}
//工厂实现
class FactoryCycle implements FactoryCycleInterface{

    private CycleType which = CycleType.Unicycle;

    public FactoryCycle() {
    }

    public FactoryCycle(CycleType which) {
        this.which = which;
    }

    public CycleType getWhich() {
        return which;
    }

    public void setWhich(CycleType which) {
        this.which = which;
    }

    @Override
    public Cycle getCycle() {
        switch (which) {
            case Bicycle:
                return new Bicycle();
            case Unicycle:
                return new Unicycle();
            case Tricycle:
                return new Tricycle();
        }
        return null;
    }
}


public class Ex08 {
    public static void main(String[] args) {
        FactoryCycle factoryCycle = new FactoryCycle();

        Cycle cycle = factoryCycle.getCycle();

        System.out.println(cycle.area());
    }
}
