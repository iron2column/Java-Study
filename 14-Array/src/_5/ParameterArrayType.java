package _5;

/**
 * @Author ChenMingYang
 * @Date 2021-09-03 21:54
 */
class ClassParameter<T>{
    public T[] f(T[] arg) {
        return arg;
    }
}

class MethodParameter {
    public static <T> T[] f(T[] arg) {
        return arg;
    }
}
public class ParameterArrayType {
    public static void main(String[] args) {
        Integer[] ints = {1, 2, 3, 4, 5};
        Double[] doubles = {1.1, 2.2, 3.3, 4.4, 5.5};
        //脱裤子放屁？
        Integer[] ints2 = new ClassParameter<Integer>().f(ints);
        Double[] doubles2 = new ClassParameter<Double>().f(doubles);

        //这个确实方便
        ints2 = MethodParameter.f(ints);
        doubles2 = MethodParameter.f(doubles);

    }
}
