/**
 * @Author ChenMingYang
 * @Date 2021-06-21 15:02
 */

/**
 * 接口Selector
 *     boolean end();
 *     Object current();
 *     void next();
 */
interface Selector {
    boolean end();

    Object current();

    void next();
}

class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }
    public void add(Object x) {
        /**
         * TODO : how?!
         */
        if (next < items.length) {
            items[next++] = x;
        }
    }

    /**
     * 内部类 & 获取内部类引用
     */
    private class SequenceSelector implements Selector {
        private int i = 0;
        //此内部类拥有外部类的数据成员访问权限，
        // 即便是私有的
        public boolean end() {
            return i == items.length;
        }
        public Object current() {
            return items[i];
        }
        public void next() {
            if (i < items.length) {
                i++;
            }
        }
    }
    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(20);
        for (int i = 0; i < 10; i++) {
            sequence.add(Integer.toString(i));
        }

        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.println(selector.current() + " ");
            selector.next();
        }
        sequence.add(Integer.toString(20));

        //! System.out.println(selector.current());
    }
}



public class Ex04 {
}
