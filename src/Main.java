
public class Main {
    public static void main(String[] args) {

        SnookerPlayer player1 = new SnookerPlayer("Domm","Czech",55000,15,10);

        player1.increasePrizeMoney(10);
        player1.updatePerformance(true);
        System.out.println("The details are: " + player1);
    }
}