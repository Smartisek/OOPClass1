import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Tournament {
    private String name;
    private double PrizeMoney;
    private ArrayList<SnookerPlayer> players;

    @Override
    public String toString() {
        return "Tournament{" +
                "name='" + name + '\'' +
                ", PrizeMoney=" + PrizeMoney +
                ", players=" + players +
                '}';
    }

    public void printInOrderOfPrizeMoney(){
        Collections.sort(players);
        System.out.println(players);
    }



    public void increaseAll(double amount){
        for(SnookerPlayer player : players){
            player.increasePrizeMoney(amount);
        }
    }

    public Tournament(String name, double prizeMoney, ArrayList<SnookerPlayer> players) {
        this.name = name;
        PrizeMoney = prizeMoney;
        this.players = players;
    }

}
