package _13_Java1容器._1_Vector和Enumeration;

import _2_填充容器._3_Abstract类.Countries;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

/**
 * @Author ChenMingYang
 * @Date 2021-10-12 16:37
 */

public class Enumerations {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>(Countries.names(10));

        Enumeration<String> e = v.elements();

        while (e.hasMoreElements()) {
            System.out.print(e.nextElement() + ", ");
        }

        //新容器向下兼容
        e = Collections.enumeration(new ArrayList<String>());

    }
}
