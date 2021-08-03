import java.io.PrintStream;
import java.util.Formatter;

/**
 * @Author ChenMingYang
 * @Date 2021-07-26 15:22
 */

public class Turtle {
    private final String name;
    private final Formatter f;

    public Turtle(String name, Formatter f) {
        this.name = name;
        this.f = f;
    }

    public static void main(String[] args) {
        PrintStream outAlias = System.out;
        //通过Formatter构造器，填入指定输出的地方，并由其进行字符编码
        Turtle tommy = new Turtle("Tommy", new Formatter(System.out));
        Turtle terry = new Turtle("Terry", new Formatter(outAlias));
        Turtle timi = new Turtle("Timi", new Formatter(System.err));
        tommy.move(0, 0);
        terry.move(4, 8);
        timi.move(1, 3);
        tommy.move(3, 4);
        terry.move(2, 5);
        timi.move(0, 0);
        tommy.move(3, 3);
        terry.move(3, 3);
        timi.move(4, 2);
        /*
        debug：
        Tommy The Turtle is at (0,0)
        Terry The Turtle is at (4,8)
        Timi The Turtle is at (1,3)
        Tommy The Turtle is at (3,4)
        Terry The Turtle is at (2,5)
        Timi The Turtle is at (0,0)
        Tommy The Turtle is at (3,3)
        Terry The Turtle is at (3,3)
        Timi The Turtle is at (4,2)

        正常模式：
        Tommy The Turtle is at (0,0)
        Terry The Turtle is at (4,8)
        Tommy The Turtle is at (3,4)
        Terry The Turtle is at (2,5)
        Tommy The Turtle is at (3,3)
        Terry The Turtle is at (3,3)
        Timi The Turtle is at (1,3)
        Timi The Turtle is at (0,0)
        Timi The Turtle is at (4,2)
         */
    }

    public void move(int x, int y) {
        f.format("%s The Turtle is at (%d,%d)\n", name, x, y);
    }
}
