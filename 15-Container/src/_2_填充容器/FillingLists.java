package _2_填充容器;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author ChenMingYang
 * @Date 2021-09-07 22:13
 */
class StringAddress {
    public void setS(String s) {
        this.s = s;
    }

    private String s;
    public StringAddress(String s) {
        this.s = s;
    }
    public String toString() {
        return super.toString() + " " + s;
    }
}
public class FillingLists {
    public static void main(String[] args) {
        List<StringAddress> list = new ArrayList<StringAddress>(Collections.nCopies(4, new StringAddress("Hello")));
        System.out.println("list = " + list);
        //=============================
        Collections.fill(list, new StringAddress("World!"));
        System.out.println("list = " + list);

        System.out.println();

        list.add(new StringAddress("Test"));
        System.out.println("list = " + list);
        StringAddress src = list.get(0);
        src.setS("reSet");
        list.set(0, src);
        System.out.println("list = " + list);

    }
}
