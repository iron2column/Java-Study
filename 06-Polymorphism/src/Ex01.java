/**
 * @Author ChenMingYang
 * @Date 2021-05-30 15:00
 */
enum Note {
    MIDDLE_C, C_SHARP, B_FLAT
}

class Instrument {
    public void play(Note note) {
        System.out.println("Instrument.play()");
    }
}

class Wind extends Instrument {
    public void play(Note note) {
        System.out.println("Wind.play()" + note);
    }
}

class Music {
    public static void tune(Instrument instrument) {
        instrument.play(Note.B_FLAT);
        instrument.play(Note.C_SHARP);
        instrument.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind myWind = new Wind();
        tune(myWind);
    }
}
public class Ex01 {

}
