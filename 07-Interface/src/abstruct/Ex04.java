package abstruct;

/**
 * @Author ChenMingYang
 * @Date 2021-06-02 17:07
 */
abstract class BaseWhat {
}

class Using extends BaseWhat {

     public void f() {

    }
}
public class Ex04 {
    static void downCast(BaseWhat baseWhat) {
        Using using = (Using) baseWhat;
    }

    public static void main(String[] args) {

    }
}
