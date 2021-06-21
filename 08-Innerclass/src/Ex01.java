/**
 * @Author ChenMingYang
 * @Date 2021-06-21 11:19
 */

public class Ex01 {
    class Contents {
        private int i = 11;
        public int value() {
            return i;
        }
    }

    class Destination {
        private String label;

        Destination(String whereTo) {
            label = whereTo;
        }

        String readLabel() {
            return label;
        }
    }

    public void ship(String dest) {
        Contents contents = new Contents();
        Destination destination = new Destination(dest);
        System.out.println(destination.readLabel());

    }

    public static void main(String[] args) {
        Ex01 ex01 = new Ex01();
        ex01.ship("Tasmania");

    }
}
