/**
 * @Author ChenMingYang
 * @Date 2021-07-25 21:40
 */

public class WhitherStringBuilder {

    public String implicit(String[] filelds) {
        String result = "";
        for (int i = 0; i < filelds.length; i++) {
            result += filelds[i];
        }
        return result;
    }

    //显示创建一个StringBuilder，以避免编译器在循环体内部自动创建SB
    public String explicit(String[] filelds) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < filelds.length; i++) {
            result.append(filelds[i]);
        }
        return result.toString();
    }
}
