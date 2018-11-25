package game;

import java.util.ArrayList;
import java.util.List;

class Devs {
    private static List<String> gamesDevs = new ArrayList<String>();

    public static void addDev(String devLabel) {
        gamesDevs.add(devLabel);
    }

    public static void print() {
        System.out.println("Game devs:");
        for (String dev: gamesDevs) {
            System.out.println(dev);
        }
    }
}

public class Games {
    public static void main(String[] args) {
        //add yourself if you are developer!
        Devs.addDev("# The mystery secret number game | by wojkY");
        Devs.addDev("# The mystery secret number game | by peysone");

        Devs.print();
    }
}
