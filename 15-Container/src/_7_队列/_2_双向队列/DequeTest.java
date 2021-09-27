package _7_队列._2_双向队列;

/**
 * @Author ChenMingYang
 * @Date 2021-09-27 23:39
 */

public class DequeTest {
    static void fillTest(Deque<Integer> deque) {
        for (int i = 20; i < 27; i++) {
            deque.addFirst(i);
        }
        for (int i = 50; i < 55; i++) {
            deque.addLast(i);
        }
    }
    public static void main(String[] args) {
        Deque<Integer> di = new Deque<>();
        fillTest(di);
        System.out.println(di);

        while (di.size() != 0) {
            System.out.print(di.removeLast() + " ");
            if (di.size() == 0) {
                System.out.println();
            }
        }

        fillTest(di);
        while (di.size() != 0) {
            System.out.print(di.removeFirst()+" ");
        }
    }
}
