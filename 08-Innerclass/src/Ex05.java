/**
 * @Author ChenMingYang
 * @Date 2021-06-21 15:39
 */

class Clz {
    String string;

    public Clz(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "Clz{" +
                "string='" + string + '\'' +
                '}';
    }
}

public class Ex05 {
    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);

        for (int i = 0; i < 5; i++) {
            sequence.add(new Clz(Integer.toString(i)));
        }

        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.println(selector.current());
            selector.next();
        }
    }

}
