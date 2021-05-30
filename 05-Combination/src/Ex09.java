/**
 * @Author ChenMingYang
 * @Date 2021-05-29 22:08
 */
class Gizmo {
    public void spin() {

    }
}

class FinalArguments {
    void with(final Gizmo gizmo) {
        //!gizmo = new Gizmo(); //无法改变引用
        System.out.println(gizmo);
    }

    void without(Gizmo gizmo) {
        gizmo = new Gizmo();
        gizmo.spin();
    }

    void f(final int i) {
//        i++;//无法改变
        System.out.println(i);
    }

    int g(final int i) {
        System.out.println(i);
        return i+1;
    }

    public static void main(String[] args) {
        FinalArguments bf = new FinalArguments();
        bf.with(new Gizmo());
        bf.without(new Gizmo());
        bf.f(0);
        System.out.println(bf.g(1));
    }

}

public class Ex09 {
}
