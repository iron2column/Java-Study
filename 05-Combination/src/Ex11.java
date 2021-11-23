/**
 * @Author ChenMingYang
 * @Date 2021-05-30 12:23
 */
class Insert {

    private int i = 9;

    protected int j;

    public Insert() {
        System.out.println("i= " + i + " ,j=" + j);
        j = 39;
    }

    private static int x1 = printInit("static Insect.x1 initialized");

    static int printInit(String s) {
        System.out.println(s);
        return 47;
    }
}

class Beetle extends Insert {
    private int k = printInit("Beetle.k initialized");

    public Beetle() {
        System.out.println("k= " + k);
        System.out.println("j= " + j);
    }

    private static int x2 = printInit("static Beetle.x2 initialized");

    public static void main(String[] args) {
        //加载static语句：
        //  18：    private static int x1 = printInit("static Insect.x1 initialized");
        //  34：    private static int x2 = printInit("static Beetle.x2 initialized");
        System.out.println("Beetle constructor");
//        Beetle beetle = new Beetle();
        //    public Insert()
        //      private int i = 9;初始化
        //      protected int j;初始化
        //    {构造
        //        System.out.println("i= " + i + " ,j=" + j);
        //        j = 39;
        //    }

        //    public Beetle()
        //    private int k = printInit("Beetle.k initialized");    初始化
        //     {构造
        //        System.out.println("k= " + k);
        //        System.out.println("j= " + j);
        //     }


    }
}


public class Ex11 {
    public static void main(String[] args) {

    }
}

