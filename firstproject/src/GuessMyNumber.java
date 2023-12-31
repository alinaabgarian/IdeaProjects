import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] args) {
        int attempts = 7;
        int number = (int) (Math.random() * 100);
        System.out.println("Guess my number!");
        boolean isGuessCorrect = false;
        for (int k = 1; k <= attempts; k++) {
            Scanner input = new Scanner(System.in);
            int guess = input.nextInt();
            if (guess == number) {
                isGuessCorrect = true;
                break;
            } else if (guess > number) {
                System.out.println("My number is smaller than that");
            } else {
                System.out.println("My number is greater than that");
            }
 
        }

        if (isGuessCorrect) {
            System.out.println("You guessed my number! - "+number);
        }
        else{
            System.out.print("Sorry but you ran out of attempts! My number was " + number);
        }
    }
}