public class SnookerPlayer implements Comparable<SnookerPlayer> {
    private String name;
    private String nationality;
    private double prizeMoney;
    private Integer numberOfGames;
    private Integer numberOfWonGames;

    public int compareTo(SnookerPlayer other) {
        if (this.prizeMoney < other.prizeMoney) {
            return -1;
        } else if (this.prizeMoney > other.prizeMoney)
            return 1;

            return 0;

    }

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

    public void updatePerformance(boolean wonGame){
        numberOfGames+=1;
        if(wonGame == true){
            numberOfWonGames+=1;
        }
    }
}
