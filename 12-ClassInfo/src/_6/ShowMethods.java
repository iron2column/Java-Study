package _6;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

/**
 * @Author ChenMingYang
 * @Date 2021-08-09 10:17
 */

class ShowMethods {
    private static String usage =
            "usage:\n"+
            "ShowMethods qualified.class.name\n"+
            "To show all methods in class or:\n"+
            "ShowMethods qualified.class.name word\n"+
            "To search for methods involving 'word'";

    private static Pattern p = Pattern.compile("(\\w+\\.)|\\s*final|\\s*native");

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println(usage);
            System.exit(0);
        }

        int lines = 0;
        try {

            Class<?> c = Class.forName(args[0]);
            Method[] methods = c.getMethods();
            Constructor<?>[] constructors = c.getConstructors();

            if (args.length == 1) {
                for (Method method : methods) {
                    System.out.println(
                            p.matcher(method.toString()).replaceAll("")
                    );
                }
                for (Constructor constructor : constructors) {
                    System.out.println(
                            p.matcher(constructor.toString()).replaceAll("")
                    );
                }
            } else {
                for (Method method : methods) {
                    if (method.toString().indexOf(args[1]) != -1) {
                        System.out.println(
                                p.matcher(method.toString()).replaceAll("")
                        );
                        lines++;
                    }
                }
                for (Constructor<?> constructor : constructors) {
                    if (constructor.toString().indexOf(args[1]) != -1) {
                        System.out.println(
                                p.matcher(constructor.toString()).replaceAll("")
                        );
                        lines++;
                    }
                }
            }

        } catch (ClassNotFoundException e) {
            System.out.println("No such class: " + e);
        }

    }
}
