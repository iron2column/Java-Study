package _9_散列与散列码._3_覆盖hashCode;

/**
 * @Author ChenMingYang
 * @Date 2021-10-03 14:42
 */

public class Individual implements Comparable<Individual> {
    private static long counter = 0;
    private final long id = counter++;
    private String name;

    public Individual(String name) {
        this.name = name;
    }

    public Individual() {
    }


    @Override
    public int compareTo(Individual arg) {
        String first = getClass().getSimpleName();
        String argFirst = arg.getClass().getSimpleName();

        int firstCompare = first.compareTo(argFirst);
        if (firstCompare!=0) {
            return firstCompare;
        }

        if (name != null && arg.name != null) {
            int secondCompare = name.compareTo(arg.name);
            if (secondCompare!=0) {
                return secondCompare;
            }
        }

        return arg.id < id ? -1 : (arg.id == id ? 0 : 1);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + (name == null ? "" : name);
    }

    public long id() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Individual &&
                id == ((Individual) o).id;
    }

    @Override
    public int hashCode() {
        int result = 37;
        if (name != null) {
            result = 37 * result + name.hashCode();
        }
        result = 37 * result + ((int) id);
        return result;
    }
}
