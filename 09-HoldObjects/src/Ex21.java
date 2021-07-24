import java.util.*;

/**
 * @Author ChenMingYang
 * @Date 2021-07-23 22:33
 */

/**
 * 在原有的【ArrayList】中的Iterable实现的基础上添加
 * 1个Iterable实现
 * @param <T>
 */
class ReversibleArrayList<T> extends ArrayList<T> {

    public ReversibleArrayList(Collection<? extends T> c) {
        super(c);
    }

    public Iterable<T> reversed() {
        return new Iterable<T>() {
            public Iterator<T> iterator() {
                return new Iterator<T>() {
                    int current = size() - 1;

                    public boolean hasNext() {
                        return current > -1;
                    }

                    public T next() {
                        return get(current--);
                    }

                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }

}

/**
 * 在原有的【IterableClass】中的Iterable实现的基础上添加
 * 2个Iterable实现
 */
class MultiIterableClass extends IterableClass {
    /**
     * 第一个
     * @return
     */
    public Iterable<String> reversed() {
        return new Iterable<String>() {
            public Iterator<String> iterator() {
                return new Iterator<String>() {
                    int current = words.length - 1;
                    public boolean hasNext() {
                        return current > -1;
                    }
                    public String next() {
                        return words[current--];
                    }
                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }

    /**
     * 第二个
     * @return
     */
    public Iterable<String> randomized() {
        return new Iterable<String>() {
            public Iterator<String> iterator() {
                List<String> shuffled = new ArrayList<>(Arrays.asList(words));
                Collections.shuffle(shuffled, new Random(47));
                return shuffled.iterator();
            }
        };
    }

    public static void main(String[] args) {
        MultiIterableClass mic = new MultiIterableClass();
        for (String s : mic) {
            System.out.print(s + " ");
        }
        System.out.println();
        for (String s : mic.reversed()) {
            System.out.print(s + " ");
        }
        System.out.println();
        for (String s : mic.randomized()) {
            System.out.print(s + " ");
        }
    }

}

public class Ex21 {
    public static void main(String[] args) {
        ReversibleArrayList<String> ral = new ReversibleArrayList<>(Arrays.asList("To be or not to be".split(" ")));

        for (String s : ral) {
            System.out.print(s + " ");
        }
        System.out.println();
        for (String s : ral.reversed()) {
            System.out.print(s + " ");
        }
    }
}

