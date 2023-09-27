import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        SnookerPlayer player1 = new SnookerPlayer("Domm","Czech",55000,15,10);
        SnookerPlayer player2 = new SnookerPlayer("Jiri","Czech",20000,10,3);
        SnookerPlayer player3 = new SnookerPlayer("David", "Czech", 500,11,5);
        SnookerPlayer player4 = new SnookerPlayer("MIchal", "Czech", 9000,10,9);

        player1.increasePrizeMoney(10);
        player1.updatePerformance(true);
        player2.updatePerformance(true);
        player2.increasePrizeMoney(2055);
//        System.out.println(player1);
//        System.out.println(player2);

        ArrayList<SnookerPlayer> list= new ArrayList<>();
        list.add(player1);
        list.add(player2);
        list.add(player3);
        list.add(player4);

        Tournament tournament1 = new Tournament("PGA",30000, list);
        tournament1.increaseAll(5000.00);
        tournament1.printInOrderOfPrizeMoney();
    }
}