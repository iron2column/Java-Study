import java.util.Formatter;

/**
 * @Author ChenMingYang
 * @Date 2021-07-26 17:01
 */

public class Receipt2 {
    private static final int W1 = 15;
    private static final int W2 = 5;
    private static final int W3 = 10;
    private double total = 0;
    private Formatter f = new Formatter(System.out);
    private String s1 = "%-" + W1 + "s %" + W2 + "s %" + W3 + "s\n";
    private String s2 = "%-" + W1 + ".15s %" + W2 + "d %" + W3 + ".2f\n";
    private String s3 = "%-" + W1 + "s %" + W2 + "s %" + W3 + ".2f\n";

    public static void main(String[] args) {
        Receipt2 receipt = new Receipt2();
        receipt.printTitle();
        receipt.print("Jack' Magic Beans", 4, 4.25);
        receipt.print("Princess Peas", 3, 5.1);
        receipt.print("Three Bears Porridge", 1, 14.29);
        receipt.printTotal();
    }

    public void printTitle() {
        f.format(s1, "Item", "Qty", "Price");
        f.format(s1, "----", "---", "----");
    }

    public void print(String name, int qty, double price) {
        f.format(s2, name, qty, price);
        total += price;
    }

    public void printTotal() {
        f.format(s3, "TAX", "", total * 0.06);
        f.format(s1, "", "", "-----");
        f.format(s3, "Total", "", total * 1.06);
    }
}
