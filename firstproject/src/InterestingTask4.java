import java.util.Scanner;

public class InterestingTask4 {
    public static void main(String[] args) {
        int hair = 70;
        boolean isGuessCorrect = false;


        for(int r=0; r<3; r++){
            Scanner input = new Scanner(System.in);
            System.out.println("Make a guess");
            int guess = input.nextInt();

            if(guess == hair){
                isGuessCorrect = true;
                break;
            }

            else{
                System.out.println("Nope. Try again!");
            }

        }

        if(isGuessCorrect){
            System.out.println("The prince wins!");
        }

        else{
            System.out.println("Bad luck...");
        }
    }
}
