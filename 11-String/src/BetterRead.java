import java.util.Scanner;

/**
 * @Author ChenMingYang
 * @Date 2021-08-03 17:31
 */

public class BetterRead {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(SimpleRead.input);
        System.out.println("What is your name?");
        String name = stdin.nextLine();
        System.out.println(name);

        System.out.println("How old are you? What is your favorite double?");
        System.out.println("(input: <age> <double>");
        int age = stdin.nextInt();
        double favourite = stdin.nextDouble();
        System.out.println(age);
        System.out.println(favourite);
        System.out.printf("Hi %s.\n", name);
        System.out.printf("In 5 years you will be %d.\n", age + 5);
        System.out.printf("My favorite double is %f.", favourite / 2);
    }
}
