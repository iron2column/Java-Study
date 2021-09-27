package _5_List功能方法;

import _2_填充容器._3_Abstract类.Countries;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @Author ChenMingYang
 * @Date 2021-09-25 13:32
 */

public class Ex7 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        LinkedList<String> linkedList = new LinkedList<String>();

        arrayList.addAll(Countries.names(5));
        linkedList.addAll(Countries.names(4));

        Iterator<String> arrayIte = arrayList.iterator();
        Iterator<String> linkedIte = linkedList.iterator();

        while (arrayIte.hasNext()) {
            System.out.print(arrayIte.next()+" ");
        }
        System.out.println();

        while (linkedIte.hasNext()) {
            System.out.print(linkedIte.next()+" ");
        }
        System.out.println();

        ListIterator<String> stringListIterator1 = arrayList.listIterator();
        ListIterator<String> stringListIterator2 = linkedList.listIterator();

        while (stringListIterator1.hasNext()) {
            if (!(stringListIterator1.nextIndex() % 2 == 0) && stringListIterator2.hasNext()) {
                System.out.println(stringListIterator1.nextIndex());
                stringListIterator1.add(stringListIterator2.next());
            }
            stringListIterator1.next();
        }

        System.out.println(arrayList);

    }
}
