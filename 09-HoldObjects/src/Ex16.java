import java.util.PriorityQueue;

/**
 * @Author ChenMingYang
 * @Date 2021-07-23 17:04
 */

class SimpleObj {

}

public class Ex16 {
    public static void main(String[] args) {

        PriorityQueue<SimpleObj> simpleObjs = new PriorityQueue<>();

        for (int i = 0; i < 10; i++) {
            SimpleObj simpleObj = new SimpleObj();
            //!添加第二个实例时异常
            //TODO 十七章解释
            simpleObjs.offer(simpleObj);
        }

    }
}
