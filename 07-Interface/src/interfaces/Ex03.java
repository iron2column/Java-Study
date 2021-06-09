package interfaces;

import java.util.Arrays;

/**
 * @Author ChenMingYang
 * @Date 2021-06-09 21:24
 */
class StringReverse extends Processor{
    String process(Object input) {
        return Arrays.toString(((String) input).split(""));
    }
}
public class Ex03 {
    public static void main(String[] args) {
        Apply.process(new StringReverse(),"what is is mean?");
    }
}
