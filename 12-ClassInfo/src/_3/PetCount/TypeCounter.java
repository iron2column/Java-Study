package _3.PetCount;

import java.util.HashMap;

/**
 * @Author ChenMingYang
 * @Date 2021-08-08 12:12
 */

public class TypeCounter extends HashMap<Class<?>, Integer> {
    private Class<?> baseType;

    public TypeCounter(Class<?> baseType) {
        this.baseType = baseType;
    }

    /**
     * 预先检查
     * @param obj
     */
    public void count(Object obj) {
        Class<?> type = obj.getClass();
        //关键性步骤，是确认类在继承体系中进行收集的步骤
        if (!baseType.isAssignableFrom(type)) {
            throw new RuntimeException(obj + " incorrect type: " + type + ", should be type or subtype of" + baseType);
        }
        countClass(type);
    }

    /**
     * 核心功能
     * get()
     * put()
     * @param type
     */
    private void countClass(Class<?> type) {
        Integer quantity = get(type);
        put(type, quantity == null ? 1 : quantity + 1);
        Class<?> superclass = type.getSuperclass();
        if (superclass != null && baseType.isAssignableFrom(superclass)) {
            countClass(superclass);
        }
    }

    /**
     * 显示功能
     * Map中的entrySet()进行遍历
     * @return
     */
    public String toString() {
        StringBuilder result = new StringBuilder("{");
        for (Entry<Class<?>, Integer> pair : entrySet()) {
            result.append(pair.getKey().getSimpleName());
            result.append("=");
            result.append(pair.getValue());
            result.append(", ");
        }
        result.delete(result.length() - 2, result.length());
        result.append("}");
        return result.toString();
    }
}
