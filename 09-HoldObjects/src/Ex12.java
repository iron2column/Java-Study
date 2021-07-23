import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * @Author ChenMingYang
 * @Date 2021-07-23 11:31
 */

public class Ex12 {

    //删除并检索队列
    public static void printQ(Queue queue) {
        while (queue.peek() != null) {
            //remove方法不仅是删除队列元素，还会返回删除的内容
            System.out.print(queue.remove() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Random random = new Random(47);

        for (int i = 0; i < 10; i++) {
            queue.offer(random.nextInt(i+10));
        }

        printQ(queue);


        //————————————————————

        Queue<Character> characters = new LinkedList<Character>();


        for (char c : "HelloWorld".toCharArray()) {
            characters.offer(c);
        }

        printQ(characters);

    }
}
