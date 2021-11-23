package interfaces;

/**
 * @Author ChenMingYang
 * @Date 2021-06-06 15:51
 */

import java.util.Arrays;

/**
 * 作为基类被使用：
 * name() : return className
 * process(Object) : return Object
 */
class Processor {
    /**
     * 提供基础服务，都可以复用，
     * 因为它完全依靠自己的自身性质去执行
     *
     * @return
     */
    public String name() {
        return getClass().getSimpleName();
    }

    Object process(Object input) {
        return input;
    }
}

/**
 * 提供大写转换
 */
class Upcase extends Processor {
    Object process(Object input) {
        return ((String) input).toUpperCase();
    }

}

/**
 * 提供小写转化
 */
class Downcase extends Processor {
    Object process(Object input) {
        return ((String) input).toLowerCase();
    }
}

class Splitter extends Processor {

    Object process(Object input) {
        String[] split = ((String) input).split(" ");
        return Arrays.toString(split);
    }
}

class Apply {
    public static String string = "Disagreement with beliefs is by definition incorrect";

    /**
     * 这是一种什么模式？
     * 策略模式！
     * 巧妙的地方在于：静态方法提供了
     * - 策略的参数位
     * - 需要处理的对象
     *
     * @param processor
     * @param s
     */
    public static void process(Processor processor, Object s) {
        System.out.println("Using Process " + processor.name());
        System.out.println(processor.process(s));
    }

    public static void main(String[] args) {
        Apply.process(new Upcase(), string);
        Apply.process(new Downcase(), string);
        Apply.process(new Splitter(), string);

    }
}

public class Ex01 {
}
