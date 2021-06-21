package interfaces;

/**
 * 组合接口时的名字冲突
 *
 * @Author ChenMingYang
 * @Date 2021-06-17 16:31
 */

interface I1 {
    void f();
}

interface I2 {
    int f(int i);
}

interface I3 {
    int f();
}

class C {
    public int f() {
        return 1;
    }
}

/*
 * I1 : f() - void
 * I2 : f(int) - int
 * I3 : f() - int
 * C  : f() - int
 */

/**
 * I1 : f() - void
 * I2 : f(int) - int
 * 接口1和接口2
 * 返回类型和入参不同
 * 需要重写接口
 */
class C2 implements I1, I2 {

    /**
     * I1
     */
    public void f() {
    }

    /**
     * I2
     */
    public int f(int i) {
        return 0;
    }
}

/**
 * C  : f() - int
 * I2 : f(int) - int
 * 基类C和接口2
 * 入参不同
 * 需要重写接口
 */
class C3 extends C implements I2 {

    public int f(int i) {
        return 0;
    }
}

/**
 * I3 : f() - int
 * C  : f() - int
 * 基类C和接口3
 * ==
 * 无需重写，但是可以重写
 */
class C4 extends C implements I3 {

    /**
     * 重写Override：外壳不变，实现内容变
     *
     * @return
     */
    public int f() {
        return super.f();
    }
}

/**
 * I1 : f() - void
 * C  : f() - int
 * 基类C和接口1
 * 返回类型不同
 * 无法实现，命名冲突
 */
//!class C5 extends C implements I1 { }

/**
 * I1 : f() - void
 * I3 : f() - int
 *   返回值类型不同
 *  无法实现，命名冲突
 */
//!interface I4 extends I1, I3 { }

public class Ex05 {

}

