import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        SnookerPlayer player1 = new SnookerPlayer("Domm","Czech",55000,15,10);
        SnookerPlayer player2 = new SnookerPlayer("Jiri","Czech",0,10,3);
        SnookerPlayer player3 = new SnookerPlayer("David", "Czech", 500,11,5);

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

        Tournament tournament1 = new Tournament("PGA",30000, list);
//        System.out.println(list);
    }
}