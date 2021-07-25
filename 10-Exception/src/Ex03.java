/**
 * @Author ChenMingYang
 * @Date 2021-07-25 16:10
 */

public class Ex03 {
    public static void main(String[] args) {
        try {
            throw new Exception("hello exception");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("hello there");
        }
    }
}
