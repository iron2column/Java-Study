package _10;

import java.util.Arrays;
import java.util.List;

/**
 * @Author ChenMingYang
 * @Date 2021-08-28 17:41
 */

public class CompilerIntelligence {
    public static void main(String[] args) {
        List<? extends Fruit> flist = Arrays.asList(new Apple());
        Apple a = (Apple) flist.get(0);
        Apple newOne = new Apple();
        //!boolean addOf1 = flist.add(newOne);
        //!boolean addOf2 = flist.add((Fruit) newOne);
        boolean contains = flist.contains(newOne);//false
        int i = flist.indexOf(new Apple());//-1
        System.out.println(flist.contains(flist.get(0)));
        System.out.println(flist.indexOf(flist.get(0)));

    }
}
