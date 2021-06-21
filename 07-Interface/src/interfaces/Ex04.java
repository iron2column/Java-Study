package interfaces;

/**
 * @Author ChenMingYang
 * @Date 2021-06-11 16:55
 */

/**
 * 可以打架
 */
interface CanFight {
    void fight();
}
/**
 * 可以游泳
 */
interface CanSwim {
    void swim();
}
/**
 * 可以飞
 */
interface CanFly {
    void fly();
}

interface CanClimb {
    void climb();
}
/**
 * 动作演员
 */
class ActonCharacter {
    /**
     * 怎么打架
     */
    public void fight() {
    }
}

class Hero extends ActonCharacter implements CanFight, CanFly, CanSwim,CanClimb {

    public void swim() {

    }

    public void fly() {

    }

    public void climb() {

    }
}

class Adventure {
    public static void t(CanFight x) {
        x.fight();
    }

    public static void u(CanSwim x) {
        x.swim();
    }

    public static void v(CanFly x) {
        x.fly();
    }

    public static void w(ActonCharacter x) {
        x.fight();
    }

    public static void c(CanClimb x) {
        x.climb();
    }


    public static void main(String[] args) {
        Hero hero = new Hero();
        t(hero);
        u(hero);
        v(hero);
        w(hero);
        c(hero);
    }
}

public class Ex04 {
}
