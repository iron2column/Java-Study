package _8;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author ChenMingYang
 * @Date 2021-08-26 10:56
 */
class Building {
}

class House extends Building {
}

public class ClassTypeCapture<T> {
    Class<T> kind;

    Map<String, Class<?>> map;

    public ClassTypeCapture(Class<T> kind) {
        this.kind = kind;
    }

    public ClassTypeCapture(Class<T> kind, Map<String, Class<?>> map) {
        this.kind = kind;
        this.map = map;
    }

    public static void main(String[] args) {
        ClassTypeCapture<Building> cttMap
                = new ClassTypeCapture<>(Building.class, new HashMap<>());
        cttMap.addType("House", House.class);
        cttMap.addType("Building",Building.class);
        System.out.println(cttMap.map);

        try {
            Building building = (Building) cttMap.createNew("Building");
            System.out.println(building);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("++++++++++");
        ClassTypeCapture<Building> ctt1
                = new ClassTypeCapture<Building>(Building.class);
        System.out.println(ctt1.f(new Building()));
        System.out.println(ctt1.f(new House()));

        ClassTypeCapture<House> ctt2 =
                new ClassTypeCapture<House>(House.class);
        System.out.println(ctt2.f(new Building()));
        System.out.println(ctt2.f(new House()));

    }

    void addType(String typename, Class<?> kind) {
        map.put(typename, kind);
    }

    Object createNew(String typename) throws InstantiationException, IllegalAccessException {
        if (map.containsKey(typename)) {
            return map.get(typename).newInstance();
        }
        System.out.println("[" + typename + "] class not available");
        return null;
    }

    public boolean f(Object arg) {
        return kind.isInstance(arg);
    }


}
