import java.util.Scanner;

public class ArrayTask2 {
    public static void main(String[] args) {
        int array[] = new int[10];
        for (int a = 0; a < array.length; a++) {
            array[a] = (int) (Math.random() * 10);
        }
        System.out.print("What numbers do you think is in this array?");
        boolean isGuess1Correct = false;
        boolean isGuess2Correct = false;

        Scanner input = new Scanner(System.in);
        int guess1 = input.nextInt();
        int guess2 = input.nextInt();

        for (int y = 0; y < array.length; y++) {
            if (guess1 == array[y]) {
                isGuess1Correct = true;
                break;
            }
        }
        for (int y = 0; y < array.length; y++) {
            if (guess2 == array[y]) {
                isGuess2Correct = true;
                break;
            }
        }
        if (isGuess1Correct && !isGuess2Correct) {
            System.out.println("Number " + guess1 + " is in the array while " + guess2 + " is not");
        }else if(isGuess2Correct && !isGuess1Correct) {
            System.out.println("Number " + guess2 + " is in the array" + guess1 + " is not");
        }else if(isGuess1Correct && isGuess2Correct){
            System.out.println("Both " + guess1 + "and" + guess2 + "are in this array");
        }else if(!isGuess1Correct && !isGuess2Correct){
            System.out.println("Both " + guess1 + " and " + guess2 + " are not in this array");

        }

        for(int k = 0; k < array.length; k++) {
            System.out.println(array[k]);
        }
    }
}
