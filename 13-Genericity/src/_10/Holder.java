package _10;

/**
 * @Author ChenMingYang
 * @Date 2021-08-30 12:59
 */

public class Holder<T> {
    private T value;

    public Holder() {
    }

    public Holder(T value) {
        this.value = value;
    }

    public void set(T var) {
        value = var;
    }

    public T get() {
        return value;
    }

    public boolean equals(Object t) {
        return value.equals(t);
    }

    public static void main(String[] args) {
        Holder<Apple> appleHolder = new Holder<>();
        appleHolder.set(new Apple());
        //!appleHolder.set(new Fruit());

        //!Holder<Fruit> fruitHolder = appleHolder;
        Holder<? extends Fruit> eHolder = appleHolder;
        Fruit fruit = eHolder.get();
        Apple app = (Apple) eHolder.get();
        try {
            Orange orange = (Orange) eHolder.get();//没有报错，但是运行时类型转换异常
        } catch (Exception e) {
            System.out.println(e);
        }
        //!eHolder.set(new Apple());
        //!eHolder.set(new Fruit());
        System.out.println(eHolder.equals(app));

    }

}
