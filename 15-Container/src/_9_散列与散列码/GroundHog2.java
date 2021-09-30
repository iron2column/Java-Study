package _9_散列与散列码;

/**
 * @Author ChenMingYang
 * @Date 2021-09-29 15:06
 */

public class GroundHog2 extends Groundhog {

    public GroundHog2(int number) {
        super(number);
    }

    /*--------想要将本类作为Hash的键，就必须合理的重写此方法--------*/
    @Override
    public boolean equals(Object obj) {
        return obj instanceof GroundHog2 && ((GroundHog2) obj).number == number;
    }
    @Override
    public int hashCode() {
        return this.number;
    }
}
