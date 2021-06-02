/**
 * @Author ChenMingYang
 * @Date 2021-05-31 17:53
 */
class Super {
    public int filed = 0;

    public int getFiled() {
        return filed;
    }
}

class Sub extends Super {
    public int filed = 1;

    public int getFiled() {
        return filed;
    }

    public int getSuperFiled() {
        return super.filed;
    }
}

public class Ex02 {
    public static void main(String[] args) {

        Super aSuper = new Sub();

        System.out.println("aSuper.filed = " + aSuper.filed);
        System.out.println("aSuper.getFiled() = " + aSuper.getFiled());
        /* output:
        aSuper.filed = 0 ,aSuper.getFiled() = 1
        说明：访问域是由编译器解析的，编译器解析就意味着，「引用是哪个类的引用」，那么访问的域就是那个类的域
         */

    }
}
