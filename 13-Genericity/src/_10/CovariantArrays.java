package _10;

/**
 * @Author ChenMingYang
 * @Date 2021-08-28 16:48
 */
class Fruit { }

class Apple extends Fruit {

}

class Jonathan extends Apple{}

class Orange extends Fruit {

}


/**
 * 泛型数组：<br>
 * 「声明引用」类型和「new对象」类型的相互影响
 * <li>引用可以是基类</li>
 * <li>new可以是上面基类的导出类</li>
 * <li>向数组内添加对象时，其类型只能是「new对象」类型的本身或其导出类，不能是其基类</li>
 * <li>补充，放入引用类型也是可以的，但是会报异常</li>
 */
public class CovariantArrays {
    public static void main(String[] args) {

        Fruit[] fruit = new Apple[10];
        fruit[0] = new Apple();
        fruit[1] = new Jonathan();

        try {
            fruit[0] = new Fruit();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
