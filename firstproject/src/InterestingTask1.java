import java.util.Scanner;

public class InterestingTask1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("What is the width of the room?");
        int width = sc.nextInt();
        System.out.println("What is the length of the room");
        int length = sc.nextInt();

        int area = width*length;

        int amountOfPain = area/10;

        System.out.println("You need "+amountOfPain+" litre of paint");


    }
}
