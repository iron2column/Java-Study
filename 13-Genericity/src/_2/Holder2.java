package _2;

/**
 * @Author ChenMingYang
 * @Date 2021-08-12 11:21
 */

public class Holder2 {
    private Object a;

    public Holder2(Object a) {
        this.a = a;
    }

    public void set(Object a) {
        this.a = a;
    }

    public Object get() {
        return a;
    }
    public static void main(String[] args) {
        Holder2 h2 = new Holder2(new Automobile());
        Automobile a = (Automobile) h2.get();

        h2.set("Not an Automobile");
        //可以考虑修改或添加方法时在方法的内部进行类型转换
        String s = (String) h2.get();

        h2.set(1);
        Integer x = (Integer) h2.get();
    }
}
