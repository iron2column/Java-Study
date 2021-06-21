/**
 * @Author ChenMingYang
 * @Date 2021-06-21 14:40
 */

public class Ex02 {
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

    public Destination to(String s) {
        return new Destination(s);
    }
    public Contents contents() {
        return new Contents();
    }

    public void ship(String dest) {
        Contents c = contents();
        Destination d = to(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
        Ex02 ex02 = new Ex02();
        ex02.ship("TAsmania");
        Ex02 ex021 = new Ex02();
        Ex02.Contents contents = ex021.contents();
        Ex02.Destination destination = ex021.to("Borneo");

    }
}
