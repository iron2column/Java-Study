package _12_持有引用;

import java.lang.ref.*;
import java.util.LinkedList;

/**
 * @Author ChenMingYang
 * @Date 2021-10-11 21:09
 */
class VeryBig {
    private static final int SIZE = 10000;
    private long[] la = new long[SIZE];
    private String ident;

    public VeryBig(String ident) {
        this.ident = ident;
    }

    public String toString() {
        return ident;
    }

    protected void finalize() {
        System.out.println("Finalizing " + ident);
    }
}
public class References {
    private static ReferenceQueue<VeryBig> rq = new ReferenceQueue<VeryBig>();

    private static void checkQueue() {
        Reference<? extends VeryBig> inq = rq.poll();
        if (inq != null) {
            System.out.println("In queue: " + inq.get());
        }
    }

    public static void main(String[] args) {
        int size = 10;
        if (args.length>0) {
            size = new Integer(args[0]);
        }

        LinkedList<SoftReference<VeryBig>> softReference_LinkedList = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            softReference_LinkedList.add(new SoftReference<VeryBig>(new VeryBig("soft " + i), rq));
            System.out.println("Just created: " + softReference_LinkedList.getLast());
            checkQueue();
        }

        System.out.println();

        LinkedList<WeakReference<VeryBig>> weakReference_LinkedList = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            weakReference_LinkedList.add(new WeakReference<VeryBig>(new VeryBig("weak " + i), rq));
            System.out.println("Just created: " + weakReference_LinkedList.getLast());
            checkQueue();
        }

        System.out.println();

        SoftReference<VeryBig> s = new SoftReference<>(new VeryBig("Soft"));
        WeakReference<VeryBig> w = new WeakReference<>(new VeryBig("Weak"));
        System.gc();

        LinkedList<PhantomReference<VeryBig>> phantomReference_LinkedList = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            phantomReference_LinkedList.add(new PhantomReference<VeryBig>(new VeryBig("Phantom " + i), rq));
            System.out.println("Just created: " + phantomReference_LinkedList.getLast());
            checkQueue();
        }
    }
}
