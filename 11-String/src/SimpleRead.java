import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

/**
 * @Author ChenMingYang
 * @Date 2021-08-03 16:37
 */

public class SimpleRead {
    public static BufferedReader input = new BufferedReader(
            new StringReader("Sir Robin of Camelot\n22 1.61803")
    );

    public static void main(String[] args) {
        try {

            System.out.println("What is your name?");
            String name = input.readLine();
            System.out.println(name);

            System.out.println(
                    "How old are you? What is you favorite double?"
            );
            System.out.println("(input: <age> <double>)");
            String number = input.readLine();
            System.out.println(number);

            String[] numArray = number.split(" ");
            int age = Integer.parseInt(numArray[0]);
            double favorite = Double.parseDouble(numArray[1]);
            System.out.printf("Hi %s.\n", name);
            System.out.printf("In 5 years you will be %d.\n", age + 5);
            System.out.printf("My favorite double is %f.", favorite / 2);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

