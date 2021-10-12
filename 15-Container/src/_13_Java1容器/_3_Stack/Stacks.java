package _13_Java1容器._3_Stack;

import java.util.LinkedList;
import java.util.Stack;

/**
 * @Author ChenMingYang
 * @Date 2021-10-12 16:54
 */
enum Month {
    JANUARY,FEBRUARY,MARCH,APRIL,MAY,JUNE,JULY,AUGUST,SEPTEMBER,OCTOBER, NOVEMBER,
}
public class Stacks {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        for (Month value : Month.values()) {
            stack.push(value.toString());
        }
        System.out.println("stack = " + stack);

        stack.addElement("the last line");
        System.out.println("stack.elementAt(5) = " + stack.elementAt(5));
        System.out.println("stack.elementAt(0) = " + stack.elementAt(0));
        System.out.println("stack.elementAt(stack.size()-1) = " + stack.elementAt(stack.size() - 1));

        while (!stack.empty()) {
            System.out.print(stack.pop()+"\t");
            if (stack.empty()) {
                System.out.println();
            }
        }

        LinkedList<String> ls = new LinkedList<>();
        for (Month value : Month.values()) {
            ls.addFirst(value.toString());
        }
        System.out.println("ls = " + ls);

    }
}
