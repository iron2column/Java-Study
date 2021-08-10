package _8;

import java.util.Arrays;
import java.util.List;

/**
 * @Author ChenMingYang
 * @Date 2021-08-10 10:56
 */

public class ShowRemovalRobot implements Robot {
    private String name;

    public ShowRemovalRobot(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Robot.Test.test(new ShowRemovalRobot("Slusher"));
    }

    public String name() {
        return name;
    }

    public String model() {
        return "SnowBot Series 11";
    }

    public List<Operation> operations() {
        return Arrays.asList(
                new Operation() {
                    public String description() {
                        return name + " can shovel snow";
                    }

                    public void command() {
                        System.out.println(name + " shoveling snow");
                    }
                },
                new Operation() {
                    public String description() {
                        return name + " can chip ice";
                    }

                    public void command() {
                        System.out.println(name + " shoveling snow");
                    }
                },
                new Operation() {
                    public String description() {
                        return name + " can clear the roof";
                    }

                    public void command() {
                        System.out.println(name + " clearing roof");
                    }
                }
        );
    }
}
