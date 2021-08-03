import java.util.Scanner;

/**
 * @Author ChenMingYang
 * @Date 2021-08-03 17:29
 */

public class Ex20 {
    private int anInt;
    private long aLong;
    private float aFloat;
    private double aDouble;
    private String string;

    public Ex20(String string) {
        Scanner stdin = new Scanner(string);
        this.aLong = stdin.nextLong();
        this.aFloat = stdin.nextFloat();
        this.aDouble = stdin.nextDouble();
        this.anInt = stdin.nextInt();
        this.string = stdin.next();
    }


    @Override
    public String toString() {
        return "Ex20{" +
                "anInt=" + anInt +
                ", aLong=" + aLong +
                ", aFloat=" + aFloat +
                ", aDouble=" + aDouble +
                ", string='" + string + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Ex20 ex20 = new Ex20("94360L 250.12F 30.00D 22 hello");
        System.out.println(ex20);
    }
}
