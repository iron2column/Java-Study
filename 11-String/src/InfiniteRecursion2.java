/**
 * @Author ChenMingYang
 * @Date 2021-07-26 12:28
 */

public class InfiniteRecursion2 {

    public String toString() {
        return "InfiniteRecursion address:" + super.toString() + "\n";
    }


    public static void main(String[] args) {
        System.out.println(new InfiniteRecursion2());
    }
}

