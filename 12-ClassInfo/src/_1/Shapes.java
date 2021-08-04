package _1;

import java.util.Arrays;
import java.util.List;

/**
 * @Author ChenMingYang
 * @Date 2021-08-03 23:57
 */
abstract class Shape {
    void draw() {
        System.out.println(this + ".draw()");
    }

    abstract public String toString();
}

class Circle extends Shape {
    @Override
    public String toString() {
        return "Circle";
    }
}

class Square extends Shape {
    @Override
    public String toString() {
        return "Square";
    }
}

class Triangle extends Shape {
    @Override
    public String toString() {
        return "Triangle";
    }
}

class Rhomboid extends Shape {
    @Override
    public String toString() {
        return "Rhomboid";
    }
}

public class Shapes {
    public static void main(String[] args) {
        //extracted();

        //extracted1();
        List<Shape> shapes = Arrays.asList(new Circle(), new Triangle(), new Square());
        for (Shape shape : shapes) {
            rotate(shape);
        }


    }

    private static void extracted1() {
        //向上转型
        Shape toShape = new Rhomboid();
        toShape.draw();

        //向下转型
        toShape = (Rhomboid) toShape;
        toShape.draw();

        if (toShape instanceof Shape) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        if (toShape instanceof Rhomboid) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        if (toShape instanceof Circle) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //!Circle circle = (Circle) shape;
        //circle.draw();
    }

    private static void extracted() {
        List<Shape> shapeList = Arrays.asList(new Circle(), new Square(), new Triangle());
        for (Shape shape : shapeList) {
            shape.draw();
        }
    }



    private static void rotate(Shape shape) {
        if (shape instanceof Circle) {
            System.out.println("跳过");
        } else {
            System.out.println("旋转");
        }
    }
}
