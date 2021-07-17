/**
 * 内部类的获取方式：
 * 1.内部类为静态类，则可以双名获取；
 * 2.内部类为非静态类，则需要外部类提供获取内部类的方法；
 * @Author ChenMingYang
 * @Date 2021-07-12 08:25
 */

class MyOuter {
    MyInner inner = new MyInner();

    class MyInner {
        public String name;
    }

    public MyInner getMyInner() {
        return new MyInner();
    }


}


public class Ex09 {
    public static void main(String[] args) {
        MyOuter myOuter = new MyOuter();
        MyOuter.MyInner myInner = myOuter.getMyInner();

        MyOuter myOuter1 = new MyOuter();

    }
}
