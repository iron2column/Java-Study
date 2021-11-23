package _2;

import java.lang.reflect.InvocationTargetException;

/**
 * @Author ChenMingYang
 * @Date 2021-08-04 14:58
 */
interface HasBatteries{}
interface Waterproof{}
interface Shoots{}
interface MyInter{}

class Toy {
    Toy() {
    }
    Toy(int i){
        System.out.println("非默认构造器"+i);
    }
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots,MyInter {
    FancyToy() {
        super(1);
    }
}

public class ToyTest {
    static void printInfo(Class cc) {
        System.out.println("Class name: " + cc.getName() + " is interface? [" + cc.isInterface() + "]");
        System.out.println("Simple name: " + cc.getSimpleName());
        System.out.println("Canonical name: " + cc.getCanonicalName());
        System.out.println();
    }

    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("_2.FancyToy");
        } catch (ClassNotFoundException e) {
            System.out.println("Can't find _2.FancyToy");
            System.exit(1);
        }
        printInfo(c);

        for (Class face : c.getInterfaces()) {
            printInfo(face);
        }


        Class up = c.getSuperclass();
        Object obj = null;
        try {
            obj = up.newInstance();

        } catch (InstantiationException e) {
            System.out.println("Cannot instantiate");
            System.exit(1);
        } catch (IllegalAccessException e) {
            System.out.println("Cannot access");
            System.exit(1);
        }
        printInfo(obj.getClass());

        System.out.println("---------------");


        try {
            Toy.class.getDeclaredConstructor(int.class).newInstance(717);

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
