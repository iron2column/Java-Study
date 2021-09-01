package _10;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ChenMingYang
 * @Date 2021-08-28 17:19
 */

public class GenericsAndCovariance {
    public static void main(String[] args) {
        /**
         * @see NonCovariantGenerics
         */
        //!List<Fruit> fruit = new ArrayList<Apple>();
        List<? extends Fruit> flist = new ArrayList<Apple>();

        //!flist.add(new Apple());
        //!flist.add(new Fruit());
        //!flist.add(new Object());
        flist.add(null);
        Fruit fruit = flist.get(0);
        System.out.println(flist);


    }
}
