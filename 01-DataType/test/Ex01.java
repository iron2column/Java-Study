/**
 * @Author ChenMingYang
 * @Date 2021-05-24 12:55
 */


class FloatThing{
    float aFloat;
}

public class Ex01 {
    public static void main(String[] args) {


    }



    private static void extracted1() {
        FloatThing f1 = new FloatThing();
        FloatThing f2 = new FloatThing();

        f1.aFloat = 10;
        f2.aFloat = 10;

        System.out.println(f1);
        System.out.println(f2);

        System.out.println("f1.aFloat == f2.aFloat    "+ (f1.aFloat == f2.aFloat));
        System.out.println("f1 == f2   "+ (f1== f2));
    }

    private static void extracted() {
        FloatThing f1 = new FloatThing();
        FloatThing f2 = new FloatThing();

        f1.aFloat = 2.0f;
        f2.aFloat = 4.2f;
        System.out.println("1 初始值========= "+f1.aFloat + " " + f2.aFloat);

        f1.aFloat = f2.aFloat;
        System.out.println("2 f1.aFloat = f2.aFloat========= "+f1.aFloat + " " + f2.aFloat);
        f2.aFloat = 10.0f;
        System.out.println("3 f2.aFloat = 10.0f========= "+f1.aFloat + " " + f2.aFloat);

        f1.aFloat = 2.0f;
        f2.aFloat = 4.2f;

        f1 = f2;
        System.out.println("4 f1 = f2========= "+f1.aFloat + " " + f2.aFloat);

        f2.aFloat = 3;
        System.out.println("5 f1 = f2========= "+f1.aFloat + " " + f2.aFloat);
        System.out.println("5 f1 = f2========= "+f1 + " " + f2);
    }


}

