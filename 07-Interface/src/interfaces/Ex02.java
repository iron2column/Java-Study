package interfaces;

/**
 * @Author ChenMingYang
 * @Date 2021-06-09 18:19
 */

/**
 * this is 波～
 */
class Waveform {
    //this will be init at first,and it weill equal
    //0l
    private static long counter;
    //this 'id' will be assessment with counter==0l;
    //after do that, the 'counter' will plus 1.
    private final long id = counter++;
    public String toString() {
        return "Waveform " + id;
    }
}

class Filter {
    public String name() {
        return getClass().getSimpleName();
    }
    /**
     * this step is fun;
     * it seem looks like do nothing that just return
     * what the invoker pass to it;
     * but inherit will do some changes;
     * so,this function just tell us ,
     *  what u input & what i output
     * @param input
     * @return
     */
    public Waveform process(Waveform input) {
        return input;
    }
}
/**
 * 低波过滤器
 */
class LowPass extends Filter {
    double cutoff;
    public LowPass(double cutoff) {
        this.cutoff = cutoff;
    }
    public Waveform process(Waveform input) {
        return input;
    }
}
/**
 * 高波过滤器
 */
class HighPass extends Filter {
    double cutoff;
    public HighPass(double cutoff) {
        this.cutoff = cutoff;
    }
    public Waveform process(Waveform input) {
        return input;
    }
}
/**
 * 混合过滤器
 */
class BandPass extends Filter {
    double lowCutoff, HighCutoff;
    public BandPass(double lowCutoff, double highCutoff) {
        this.lowCutoff = lowCutoff;
        HighCutoff = highCutoff;
    }
    public Waveform process(Waveform input) {
        return input;
    }
}
public class Ex02 {
    public static void main(String[] args) {
        Waveform waveform = new Waveform();
        System.out.println(waveform.toString());

    }
}
