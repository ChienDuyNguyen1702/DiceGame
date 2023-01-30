//import java.util.Random;

public class Player {
    public String MSSV;
    public int currentScore;
    public int diceID;
    //    Random rand = new Random();
    public String[] LosingWord = new String[]{"Damn, you got this !",
            "Aghh, again again again !",
            "Congratulation! ",
            "Well Done !",
            "Try me AGAIN !!!",
            "How dare you !!!",
            "Shiet, you're so lucky ! ",
            "No more next time !",
            "You cheated !! ",
            "Unbelievable !"};
    public String[] WinningWord = new String[]{
            "Yeh, I'm got this",
            "HAHAHAHHAHAH !!",
            "LOL LOSER !!",
            "What a lucky day",
            "I'm gonna rich !!!",
            "Unbelievable !",
            "How can you beat me !",
            "So easy !",
            "Who next ?",
            "Yeah I won, i quit now !"
    };
    protected String Name;

    public Player() {

    }

    public Player(String name, String mssv) {
        this.Name = name;
        this.MSSV = mssv;
    }

    public int getCurrentPoints() {
        return currentScore;
    }

    public void setCurrentPoints(int currentScore) {
        this.currentScore = currentScore;
    }

    public String getPlayerName() {
        return Name;
    }

    public String showLoseEmotion() {
        return (LosingWord[(int) (Math.random() * 10 + 0)]);
    }

    public String showWinEmotion() {
        return (WinningWord[(int) (Math.random() * 10 + 0)]);
    }

    public void roll(dice ListOfDice[]) {
        int DiceOfPoint = ListOfDice[this.diceID].rollDice();
        System.out.println(this.Name + " got " + DiceOfPoint + " point(s) "/*+" by dice "+this.diceID */);
        this.currentScore += DiceOfPoint;
    }

    public void PickADice(dice ListOfDice[], int checkChosenDice[]) {
        int chosenDice;
        do {
            chosenDice = (int) (Math.random() * 4 + 0);
        } while (checkChosenDice[chosenDice] == 1);
        this.diceID = chosenDice;
        checkChosenDice[chosenDice] = 1;
    }
}
