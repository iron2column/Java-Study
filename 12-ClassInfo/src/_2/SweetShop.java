package _2;

/**
 * @Author ChenMingYang
 * @Date 2021-08-04 14:23
 */
class Candy {
    static {
        System.out.println("Loading Candy");
    }
}

class Gum {
    static {
        System.out.println("Loading Gum");
    }
}

class Cookie {
    static {
        System.out.println("Loading Cookie");
    }
}

public class SweetShop {

    public static void main(String[] args) {
        //extracted();

        //extracted(args);
    }

    private static void extracted(String[] args) {
        if (args.length == 0) {
            System.out.println("无参数，停止运行");
            System.exit(1);
        }

        String target = args[0];

        switch (target) {
            case "Candy":
                System.out.println(target);
                new Candy();
                break;
            case "Gum":
                System.out.println(target);
                new Gum();
                break;
            case "Cookie":
                System.out.println(target);
                new Cookie();
                break;
        }
    }

    private static void extracted() {
        System.out.println("inside main");
        new Candy();
        System.out.println("After creating Candy");
        try {
            Class.forName("Gum");
        } catch (ClassNotFoundException e) {
            System.out.println("Couldn't find Gum");
        }
        System.out.println("After Class.forName(\"Gum\")");
        new Cookie();
        System.out.println("After creating Cookie");
    }
}
