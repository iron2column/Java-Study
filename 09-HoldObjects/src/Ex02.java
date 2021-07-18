import java.util.ArrayList;

/**
 * @Author ChenMingYang
 * @Date 2021-07-18 08:36
 */
class Gerbil {
    private int gerbilNumber;

    public Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    public void hup() {
        System.out.println(gerbilNumber+" 号沙鼠: 正在跳跃……");
    }
}

public class Ex02 {

    public static void main(String[] args) {
        ArrayList<Gerbil> gerbils = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            gerbils.add(new Gerbil(i + 1));
        }
        for (int i = 0; i < gerbils.size(); i++) {
            gerbils.get(i).hup();
        }
    }

}
