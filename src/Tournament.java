import java.util.ArrayList;

public class Tournament {
    private String name;
    private double PrizeMoney;
    private ArrayList<SnookerPlayer> players;

    public Tournament(String name, double prizeMoney, ArrayList<SnookerPlayer> players) {
        this.name = name;
        PrizeMoney = prizeMoney;
        this.players = players;
    }
}
