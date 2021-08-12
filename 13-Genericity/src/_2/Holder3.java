package _2;


import _3.Hamster;
import _3.Pet;

/**
 * @Author ChenMingYang
 * @Date 2021-08-12 11:53
 */

public class Holder3<T> {
    private T a;

    public Holder3(T a) {
        this.a = a;
    }

    public T get() {
        return a;
    }

    public void set(T a) {
        this.a = a;
    }

    public static void main(String[] args) {
        Holder3<Automobile> h3 = new Holder3<Automobile>(new Automobile());
        Automobile a = h3.get();//  这样一比较holder2，连类型转换都不用了
        //!h3.set("Nor an Automobile"); 编译期间就报错
        //!h3.set(1);

        Holder3<Pet> petHolder3 = new Holder3<Pet>(new Pet());
        petHolder3.set(new Hamster());

        Pet pet = petHolder3.get();
        System.out.println(pet);
    }

}
