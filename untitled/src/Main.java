public class Main {
    public static void main(String[] args) {
        final int numberOfPlayer = 4;
        final int numberOfDice = numberOfPlayer;
        dice ListOfDice[] = new dice[numberOfDice];
        ListOfDice[0] = new dice("20:16:16:16:16:16");
        ListOfDice[1] = new dice("16:20:16:16:16:16");
        ListOfDice[2] = new dice("16:16:20:16:16:16");
        ListOfDice[3] = new dice("16:16:16:20:16:16");
        int checkChosenDice[] = new int[numberOfDice]; //check if the dice has been chosen
        Referee Teacher  = new Referee();
        Player ListOfPlayer[] = new Player[numberOfPlayer];
        ListOfPlayer[0] = new Player("Chien", "20205059");
        ListOfPlayer[1] = new Player("Khanh Huyen", "20210454");
        ListOfPlayer[2] = new Player("Minh", "20205001");
        ListOfPlayer[3] = new Player("Dung", "20205004");

        for (Player indexOfList : ListOfPlayer) {
            indexOfList.PickADice(ListOfDice, checkChosenDice);
            System.out.println("Player " + indexOfList.Name + " has chosen the dice numbered " + indexOfList.diceID );
        }
//        System.out.println( "Player " + ListOfPlayer[1].Name+ ": "+ListOfPlayer[1].showLoseEmotion());
//        System.out.println( "Player " + ListOfPlayer[1].Name+ ": "+ListOfPlayer[1].showWinEmotion());
//        ListOfPlayer[0].roll(ListOfDice);
//        ListOfPlayer[1].roll(ListOfDice);
//        ListOfPlayer[2].roll(ListOfDice);
//        ListOfPlayer[3].roll(ListOfDice);
        ListOfPlayer[Teacher.ChooseWhoIsNext()].roll(ListOfDice);

    }
}