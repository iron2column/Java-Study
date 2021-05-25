import java.util.Random;

/**
 * @Author ChenMingYang
 * @Date 2021-05-24 13:23
 */

public class Ex01 {
    public static void main(String[] args) {
        //伪随机数：
        // 重复运行会发现随机数是固定的，这是因为：
        // 我们设置了随机数的种子，种子确定了，生成的数也基本是确定的
        // 如果想要每次都不一样，那么就不要设置种子，java会以当前时间
        // 作为随机种子
        Random random = new Random();


        //随机数的类型：
        // Random类提供了多种随机数字类型：
        //  int double float long
        // 只需要使用random.nextXXXX()调用即可

        //随机数的范围：
        // 在nextInt中传入的参数是一个我们想要的上限，而下限默认为0
        // 所以如果你想要一个确定上下限制的随机数范围，传入的参数应该是上限减去下限数
        // 比如我想要在20 - 50之间
        // random.nextInt((50-20))+20
        // 30是最大的随机数，那么加上20就是我们想要的最大50
        // 0是最小的随机数，那么加上20就是我们想要的最小20

    }
}
