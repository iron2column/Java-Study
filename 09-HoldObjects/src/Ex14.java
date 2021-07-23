import java.util.*;

/**
 * @Author ChenMingYang
 * @Date 2021-07-23 15:43
 */

public class Ex14 {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        Random random = new Random(47);
        for (int i = 0; i < 10; i++) {
            priorityQueue.offer(random.nextInt(i + 10));
        }
        Ex12.printQ(priorityQueue);


        List<Integer> ints = Arrays.asList(25, 22, 20, 18, 14, 9, 3, 1, 1, 2, 3, 9, 14, 18, 21, 24, 25);
        PriorityQueue<Integer> integers = new PriorityQueue<>(ints);
        Ex12.printQ(integers);

        PriorityQueue<Integer> integers1 = new PriorityQueue<>(ints.size(), Collections.reverseOrder());
        integers1.addAll(ints);
        Ex12.printQ(integers1);

        String fact = "EDUCATION SHOULD ESCHEW OBFUSCATION";
        List<String> strings = Arrays.asList(fact.split(""));

        PriorityQueue<String> stringsQueue = new PriorityQueue<>(strings);
        Ex12.printQ(stringsQueue);

        PriorityQueue<String> stringsQueue1 = new PriorityQueue<>(strings.size(), Collections.reverseOrder());
        stringsQueue1.addAll(strings);
        Ex12.printQ(stringsQueue1);

        Set<Character> characters = new HashSet<>();
        for (char c : fact.toCharArray()) {
            characters.add(c);
        }
        PriorityQueue<Character> strings1 = new PriorityQueue<Character>(characters);
        Ex12.printQ(strings1);
    }
}
