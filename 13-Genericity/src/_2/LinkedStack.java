package _2;

/**
 * @Author ChenMingYang
 * @Date 2021-08-13 18:01
 */

public class LinkedStack<T> {
    private Node top = new Node();//结束哨兵==尾指针

    public void push(T item) {
        top = new Node(item, top);
    }
    public T pop() {
        T result = top.item;
        if (!top.end()) {
            top = top.next;
        }
        return result;
    }


    private class Node {
        T item;
        Node next;

        public Node() {
            this.item = null;
            this.next = null;
        }

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }

        boolean end() {
            return item == null && next == null;
        }
    }

    //-------------------------Main---------------------------------
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        LinkedStack<String> lss = new LinkedStack<>();
        for (String s : "Phasers on stun!".split(" ")) {
            lss.push(s);
        }
        String s;
        while ((s = lss.pop()) != null) {
            System.out.println(s);
        }
        System.out.println(System.currentTimeMillis()-start);
    }
    //-------------------------Main---------------------------------

}
