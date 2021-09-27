package _6_Set和存储顺序._1_SortedSet;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @Author ChenMingYang
 * @Date 2021-09-27 00:48
 */
class MySortedSet<E> extends LinkedList<E> {
    int compare(E e1,E e2) {
        int c = e1.hashCode() - e2.hashCode();
        return (c < 0) ? -1 : ((c == 0) ? 0 : 1);
    }

    public boolean add(E e) {
        if (!this.contains(e)) {//不曾包含此元素
            Iterator<E> it = this.iterator();
            int index = 0;
            while (it.hasNext()) {//进行位置选择
                if (compare(it.next(), e) < 1) {
                    index++;
                }
            }
            add(index, e);//在指定位置进行插入
            return true;
        }
        return false;
    }

}

class T {

    @Override
    public String toString() {
        return String.valueOf(this.hashCode());
    }
}

public class Ex10 {

    public static void main(String[] args) {
        MySortedSet<T> ss = new MySortedSet<>();
        ss.add(new T());
        ss.add(new T());
        ss.add(new T());
        ss.add(new T());
        System.out.println("ss = " + ss);

        MySortedSet<Integer> ss2 = new MySortedSet<>();
        ss2.add(6);
        ss2.add(8);
        ss2.add(2);
        ss2.add(4);
        ss2.add(2);
        ss2.add(8);
        System.out.println("ss2 = " + ss2);

        MySortedSet<String> ss3 = new MySortedSet<>();
        ss3.add("three");
        ss3.add("three");
        ss3.add("seven");
        ss3.add("hi");
        ss3.add("two");
        ss3.add("one");
        System.out.println("ss3 = " + ss3);
    }


}
