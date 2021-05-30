/**
 * @Author ChenMingYang
 * @Date 2021-05-29 11:55
 */
class Simple {

}
public class Ex01 {
        private Simple simple;

        @Override
        public String toString() {
                if (simple == null) {
                        simple = new Simple();
                }
                return "Ex01{" +
                        "simple=" + simple +
                        '}';
        }

        public static void main(String[] args) {
                //生成Ex01实例，猜想Simple对象的simple引用什么时候实例化
                Ex01 ex01 = new Ex01();
                //直接访问的Simple实例=》发现并没有被实例化
                System.out.println(ex01.simple);
                //使用Ex01实例的toString（或其他）方法=》发现simple实例化了
                System.out.println(ex01);
                System.out.println(ex01.simple);
        }
}
