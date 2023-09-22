public class SnookerPlayer {
    private String name;
    private String nationality;
    private double prizeMoney;
    private Integer numberOfGames;
    private Integer numberOfWonGames;

    public SnookerPlayer(String name, String nationality, double prizeMoney, Integer numberOfGames, Integer numberOfWonGames) {
        this.name = name;
        this.nationality = nationality;
        this.prizeMoney = prizeMoney;
        this.numberOfGames = numberOfGames;
        this.numberOfWonGames = numberOfWonGames;
    }
    @Override
    public String toString() {
        return "SnookerPlayer{" +
                "name='" + name + '\'' +
                ", nationality='" + nationality + '\'' +
                ", prizeMoney=" + prizeMoney +
                ", numberOfGames=" + numberOfGames +
                ", numberOfWonGames=" + numberOfWonGames +
                '}';
    }

    public void increasePrizeMoney(double amount){
        prizeMoney = prizeMoney + amount;
    }
}
