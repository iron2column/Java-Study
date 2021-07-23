import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author ChenMingYang
 * @Date 2021-07-23 12:17
 */
class Command {
    public String string;

    public void operation() {
        System.out.println(string);
    }
}

class Que {

    public Queue<Command> fun(String s) {
        Command command = new Command();
        command.string = s;
        Queue<Command> queue = new LinkedList<>();
        queue.offer(command);
        return queue;
    }
}

public class Ex13 {
    public static void fun2(Queue<Command> queue) {
        Command poll = queue.poll();
        poll.operation();
    }

    public static void main(String[] args) {
        Que que = new Que();
        Queue<Command> queue = que.fun("Hello");
        fun2(queue);
    }
}
