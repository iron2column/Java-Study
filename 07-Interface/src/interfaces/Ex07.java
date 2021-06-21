package interfaces;

/**
 * @Author ChenMingYang
 * @Date 2021-06-21 10:09
 */
interface Fileds {
    int i = 1;

    void f();
}

class Impl implements Fileds {

    @Override
    public void f() {
        System.out.println(i);
    }
}


public class Ex07 {
    public static void main(String[] args) {
        Impl impl = new Impl();
    }
}

