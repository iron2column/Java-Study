package _8;

/**
 * @Author ChenMingYang
 * @Date 2021-08-26 12:44
 */
class ClassAsFactory<T> {
    T x;

    public ClassAsFactory(Class<T> kind) {
        try {
            this.x = kind.newInstance();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}

class Employee {
    //具有默认构造器
}

public class InstantiateGenericType {
    public static void main(String[] args) {
        ClassAsFactory<Employee> fe = new ClassAsFactory<>(Employee.class);
        System.out.println("ClassAsFactory<Employee> succeeded");
        try {
            ClassAsFactory<Integer> fi = new ClassAsFactory<>(Integer.class);
        } catch (Exception e) {
            System.out.println("构建Integer失败");
        }
        //Integer没有默认构造器
    }
}
