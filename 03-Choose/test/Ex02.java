/**
 * @Author ChenMingYang
 * @Date 2021-05-26 10:37
 */

public class Ex02 {
    public static void main(String[] args) {



    }

    /**
     * 没有break
     * 会从符合的case一直运行到有break的地方
     * （或直到default的隐藏break）
     */
    private static void f2() {
        for (int i = 0; i < 10; i++) {
            switch (i) {
                case 0:
                    System.out.println("im 1");
                case 1:
                    System.out.println("im 2");
                case 2:
                    System.out.println("im 3");
                default:
                    System.out.println("im nothing");
            }
        }
    }

    /**
     * 有break
     * 正常执行每一个对应的case
     */
    private static void f1() {
        for (int i = 0; i < 10; i++) {
            switch (i) {
                case 0:
                    System.out.println("im 1");
                    break;
                case 1:
                    System.out.println("im 2");
                    break;
                case 2:
                    System.out.println("im 3");
                    break;
                default:
                    System.out.println("im nothing");
            }
        }
    }
}
