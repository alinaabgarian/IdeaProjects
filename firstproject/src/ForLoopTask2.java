import java.util.Scanner;

public class ForLoopTask2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a = scanner.nextInt();
        boolean prime=true;
        for (int p = 2; p < a; p++) {
            if (a % p == 0) {
                prime=false;
                break;
            }

        }
        if (!prime){
            System.out.println("Number "+a+" is not prime");
        }

        else{
            System.out.println("Number "+a+" is prime");
        }

    }
}
