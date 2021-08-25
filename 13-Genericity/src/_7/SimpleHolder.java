package _7;

/**
 * @Author ChenMingYang
 * @Date 2021-08-25 15:11
 */

public class SimpleHolder {
    private Object obj;

    public void set(Object obj) {
        this.obj = obj;
    }

    public Object get() {
        return obj;
    }

    public static void main(String[] args) {
        SimpleHolder holder = new SimpleHolder();
        holder.set("Item");
        String s = (String) holder.get();

    }
}
