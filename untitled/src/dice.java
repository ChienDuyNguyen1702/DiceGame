import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class dice {

    List<Integer> ratioList;
//    public int identity;

    public dice(String ratioExpr) {//example : dice("20:16:16:16:16:16")
        this(Arrays.asList(ratioExpr.split(":")).stream().map(e -> Integer.parseInt(e)).collect(Collectors.toList()));
//        this.identity = identity;
    }

    public dice(List<Integer> ratioList) {//example : dice([20,16,16,16,16,16])
        this.ratioList = ratioList;
    }


    public static void main(String[] args) {
//        List<dice> ListOfDice
//        dice dice1 = new dice("20:16:16:16:16:16");
//        dice1.rollDice(1);
//        dice dice2 = new dice("16:20:16:16:16:16");
//        dice2.rollDice(2);
//        dice dice3 = new dice("16:16:20:16:16:16");
//        dice3.rollDice(3);

    }

    public int rollDice() {
//        System.out.print("Đổ xúc xắc được mặt có ");
        return this.getSelectIndex();
    }

    public int getSelectIndex() {       // roll the dice with ratio
        Random random = new Random();
        int sum = ratioList.stream().reduce((a, b) -> Integer.sum(a, b)).get().intValue();

        int start = 0;
        int bound = 0;
        int ran = random.nextInt(sum);  //random number from 0-100
//        System.out.println(">> random = " + ran);
        for (int i = 0; i < ratioList.size(); i++) {
            int ratio = ratioList.get(i);
            bound += ratio;
            if (ran >= start && ran < bound) {
                return i+1;
            }

            start += ratio;
//            System.out.println("start = " + start);
        }
        return -1;
    }
}
