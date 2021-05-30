/**
 * @Author ChenMingYang
 * @Date 2021-05-29 16:37
 */

class Instrument {
    public void play() {
        System.out.println("playing");
    }

    public static void tune(Instrument instrument) {
        instrument.play();
    }
}

class Wind extends Instrument {

}
public class Ex07 {
    public static void main(String[] args) {
        Instrument instrument = new Instrument();
        Wind wind = new Wind();
        //!wind.tune(); //实例居然不能使用静态方法
        Wind.tune(wind);
    }
}
