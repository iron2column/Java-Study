package _4;

import java.util.EnumSet;
import java.util.Set;

/**
 * @Author ChenMingYang
 * @Date 2021-08-20 17:22
 */

public class WatercolorSets {
    public static void main(String[] args) {
        Set<Watercolors> set1 =
                EnumSet.range(Watercolors.BRILLIANT_RED, Watercolors.VIRIDIAN_HUE);
        System.out.println(set1);

        Set<Watercolors> set2
                = EnumSet.range(Watercolors.CERULEAN_BLUE_HUE, Watercolors.BURNT_UMBER);
        System.out.println(set2);

        Set<Watercolors> union = Sets.union(set1, set2);
        //System.out.println(union);
        System.out.println(Sets.intersection(set1, set2));
        System.out.println("Sets.difference(set1, set2) = " + Sets.difference(set1, set2));
    }
}

