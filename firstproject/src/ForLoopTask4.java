import java.util.Scanner;

public class ForLoopTask4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number ");
        int a = input.nextInt();
        int accumulator = 0;
        System.out.println("Enter "+a+" numbers");
        for(int i=1; i<=a; i++){
            int y = input.nextInt();
            accumulator=accumulator+y;
        }
        System.out.println(accumulator);
    }
}
