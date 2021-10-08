package _10_选择接口的不同实现._3_微基准测试的危险;

/**
 * @Author ChenMingYang
 * @Date 2021-10-08 12:03
 */

public class RandomBounds {
    static void usage() {
        System.out.println("Usage:");
        System.out.println("\tRandomBounds lower");
        System.out.println("\tRandomBounds upper");
        System.exit(1);
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            usage();
        }
        if (args[0].equals("lower")) {
            while (Math.random() != 0.0) {

            }
            System.out.println("产生了0.0");
        } else if (args[0].equals("upper")) {
            while (Math.random() != 1.0) {

            }
            System.out.println("产生了1.0");
        } else {
            usage();
        }
    }
}

