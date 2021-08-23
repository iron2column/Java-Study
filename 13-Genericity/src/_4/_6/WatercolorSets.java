package _4._6;

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
        System.out.println("[set1]: " + set1);

        Set<Watercolors> set2
                = EnumSet.range(Watercolors.CERULEAN_BLUE_HUE, Watercolors.BURNT_UMBER);
        System.out.println("[set2]: " + set2);

        System.out.println("Sets.union(set1, set2)        -->" + Sets.union(set1, set2));
        System.out.println("Sets.intersection(set1, set2) -->" + Sets.intersection(set1, set2));
        System.out.println("Sets.difference(set1, set2)   -->" + Sets.difference(set1, set2));
    }
}

