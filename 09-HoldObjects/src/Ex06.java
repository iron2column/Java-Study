import java.util.*;

/**
 * @Author ChenMingYang
 * @Date 2021-07-19 17:46
 */

class Snow {

}

class Powder extends Snow {

}

class Light extends Powder {

}

class Heavy extends Powder {

}

class Crusty extends Snow {

}

class Slush extends Snow {

}

public class Ex06 {
    public static void main(String[] args) {
        List<Snow> snows1 = Arrays.asList(new Crusty(), new Slush(), new Powder());
        List<Snow> snows2 = Arrays.asList(new Light(), new Heavy());

        List<Snow> snows3 = new ArrayList<Snow>();
        Collections.addAll(snows3, new Light(), new Heavy());

        List<Snow> snows4 = Arrays.<Snow>asList(new Light(), new Heavy());

        System.out.println(snows1);
        System.out.println(snows2);
        System.out.println(snows3);
        System.out.println(snows4);

    }
}
