import java.util.Scanner;

public class InterestingTask2 {
    public static void main(String[] args) {
        int belly = 80;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many pots of honey is there?");
        int amountOfHoney = sc.nextInt();
        int bellyGains = amountOfHoney*2;
        int newBelly = belly+bellyGains;

        if(newBelly<=95){
            System.out.println("Everything is fine");
        }
        else {
            System.out.println("Someone eats a lot!");
        }
    }
}
