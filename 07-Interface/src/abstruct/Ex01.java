package abstruct;

/**
 * @Author ChenMingYang
 * @Date 2021-06-02 16:19
 */
enum Note {
    LOW, MIDDLE, HIGH,
}

abstract class Instrument {
    private int i;

    public abstract void play(Note note);

    public String what() {
        return "Instrument.what()";
    }

    public abstract void adjust();
}

/**
 * 风琴
 */
class Wind extends Instrument {

    public void play(Note note) {
        System.out.println("Wind.play() " + note);
    }

    public String what() {
        return "Wind.what()";
    }

    public void adjust() {

    }
}

/**
 * 打击乐器
 */
class Percussion extends Instrument {

    public void play(Note note) {
        System.out.println("Percussion.play() " + note);

    }

    public String what() {
        return "Percussion.what()";
    }

    public void adjust() {

    }
}

/**
 * 弦
 */
class Stringed extends Instrument {

    public void play(Note note) {
        System.out.println("Stringed.play() " + note);
    }

    public String what() {
        return "Stringed.what()";
    }


    public void adjust() {

    }
}


class Woodwind extends Wind {
    public void play(Note note) {
        System.out.println("Woodwind.play " + note);
    }

    public String what() {
        return "Woodwind.what()";
    }
}

class Brass extends Wind {
    public void play(Note note) {
        System.out.println("Brass.play() " + note);
    }

    public void adjust() {
        System.out.println("Brass.adjust()");
    }
}


class Music {
    static void tune(Instrument instrument) {
        instrument.play(Note.HIGH);
        instrument.play(Note.MIDDLE);
        instrument.play(Note.LOW);
    }

    static void tuneAll(Instrument[] a) {
        for (Instrument instrument : a) {
            tune(instrument);
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };

        tuneAll(orchestra);
    }
}


public class Ex01 {
}
