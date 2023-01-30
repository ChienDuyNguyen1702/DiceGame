import java.util.Scanner;

public class Referee {
    //    private final ArrayList<Player> playerList = new ArrayList<Player>();
    public static final int MAX_PLAYER = 4;
    public static final int WIN_SCORE = 21;
    Scanner Input = new Scanner(System.in);

    public Referee() {

    }

    public int ChooseWhoIsNext() {
        int ChosenPlayer;
        do {
            System.out.print("The next player is : ");

            ChosenPlayer = Input.nextInt();
            System.out.println(ChosenPlayer);

        } while (ChosenPlayer < 0 || ChosenPlayer > MAX_PLAYER);
        return ChosenPlayer;
    }

    public int checkwinner(Player ListOfPlayer[]) {
        for (int i = 0; i < MAX_PLAYER; i++) {
            if (ListOfPlayer[i].currentScore >= 21)
                return i;
        }
        return -1;
    }
}
