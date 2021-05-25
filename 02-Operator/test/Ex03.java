/**
 * @Author ChenMingYang
 * @Date 2021-05-24 14:05
 */
class Dog {
    String name;
    String say;
}
public class Ex03 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        dog1.name = "spot";
        dog1.say = "Ruff!";

        dog2.name = "scruffy";
        dog2.say = "Wurl!";

        System.out.println(dog1.name + ":" + dog1.say);
        System.out.println(dog2.name + ":" + dog2.say);

        Dog dog = new Dog();

        dog = dog1;
        System.out.println(dog.equals(dog1));

    }
}
