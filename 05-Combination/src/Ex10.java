/**
 * @Author ChenMingYang
 * @Date 2021-05-29 22:39
 */
class WithFinal {

    //开放接口
    public void g() {
        System.out.println("WithFinal.g()");
    }
}

class Over extends WithFinal {
    //继续开放  但是不再允许修改
    public final void g() {
        System.out.println("Over.g()");
    }

}

class Over2 extends Over {
//    不被允许覆盖
//！    public void g() {
//！        System.out.println("Over2.g()");
//！   }
}

public class Ex10 {
    public static void main(String[] args) {
        Over2 over2 = new Over2();
        over2.g();

        //转型
        Over over = over2;
        over.g();

        //再转型
        WithFinal withFinal = over;
        withFinal.g();

        WithFinal withFinal1 = new WithFinal();
        withFinal1.g();

    }
}
