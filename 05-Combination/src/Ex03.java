/**
 * @Author ChenMingYang
 * @Date 2021-05-29 12:55
 */
class Art {
    public Art() {
        System.out.println("先构造我 Art:构造");
    }
}

class Drawing extends Art {
    public Drawing() {
        System.out.println("然后是我 Drawing:构造");
    }
}

class Cartoon extends Drawing {
    public Cartoon() {
        System.out.println("最后才是我 Cartoon:构造");
    }
}


public class Ex03 {
    public static void main(String[] args) {
        Cartoon cartoon = new Cartoon();

    }
}
