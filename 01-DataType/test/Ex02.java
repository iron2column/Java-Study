/**
 * @Author ChenMingYang
 * @Date 2021-05-24 13:12
 */
class Letter {
    char aChar;
}
public class Ex02 {
    static void f(Letter letter) {
        System.out.println(letter);
        letter.aChar = 'z';
    }

    public static void main(String[] args) {
        Letter letter = new Letter();
        letter.aChar = 'a';
        System.out.println(letter);
        System.out.println("letter.char=" + letter.aChar);
        f(letter);
        System.out.println("letter.char=" + letter.aChar);

    }
}
