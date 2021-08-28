package _9;

import java.awt.*;

/**
 * @Author ChenMingYang
 * @Date 2021-08-27 18:16
 */
interface HasColor {
    Color getColor();
}

class Colored<T extends HasColor> {
    //数据结构
    T item;

    //构造器
    Colored(T item) {
        this.item = item;
    }

    //获取项
    T getItem() {
        return item;
    }

    //边界的使用使得可以使用边界类型的方法
    Color color() {
        return item.getColor();
    }
}

class Dimension {
    public int x, y, z;
}

class ColoredDimension<T extends Dimension & HasColor> {
    //泛型类属性
    T item;

    //构造器
    ColoredDimension(T item) {
        this.item = item;
    }

    //获取属性项
    T getItem() {
        return item;
    }

    Color color() {return item.getColor();}

    //获取泛型另一个限定类的属性
    int getX() {
        return item.x;
    }

    int getY() {
        return item.y;
    }

    int getZ() {
        return item.z;
    }
}

interface Weight {
    int weight();
}

//与继承一样，您只可以有一个具体类，但可以有多个接口
class Solid<T extends Dimension & HasColor & Weight> {
    T item;

    Solid(T item) {
        this.item = item;
    }

    T getItem() {
        return item;
    }

    Color color() {
        return item.getColor();
    }

    //获取泛型另一个限定类的属性
    int getX() {
        return item.x;
    }

    int getY() {
        return item.y;
    }

    int getZ() {
        return item.z;
    }

    int weight() {
        return item.weight();
    }
}

//泛型类的导出类
class Bounded extends Dimension implements HasColor,Weight{
    @Override
    public Color getColor() {
        return null;
    }

    @Override
    public int weight() {
        return 0;
    }
}

public class BasicBounds {
    public static void main(String[] args) {
        Solid<Bounded> solid = new Solid<Bounded>(new Bounded());
        solid.color();
        solid.getY();
        solid.weight();
    }
}
