package _12_持有引用._1_WeakHashMap;

import java.util.WeakHashMap;

/**
 * @Author ChenMingYang
 * @Date 2021-10-12 16:15
 */
class Element {
    private String ident;

    public Element(String ident) {
        this.ident = ident;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Element && this.ident.equals(((Element) o).ident);
    }

    @Override
    public int hashCode() {
        return ident.hashCode();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize " + getClass().getSimpleName() + " " + ident);
    }
}

class Key extends Element {

    public Key(String ident) {
        super(ident);
    }
}

class Value extends Element {
    public Value(String ident) {
        super(ident);
    }
}

public class CanonicalMapping {
    public static void main(String[] args) {
        int size = 1000;
        Key[] keys = new Key[size];
        WeakHashMap<Key, Value> map = new WeakHashMap<>();

        for (int i = 0; i < size; i++) {
            Key key = new Key(Integer.toString(i));
            Value value = new Value(Integer.toString(i));

            if (i % 3 == 0) keys[i] = key;

            map.put(key, value);
        }
        System.out.println(map.size());

        System.gc();

        System.out.println(map.size());

    }

}
