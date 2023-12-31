import java.util.Scanner;
public class TwoDimenArrayTask1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many rows would you like?");
        int rows = input.nextInt();
        System.out.println("How many columns would you like?");
        int columns = input.nextInt();

        int array[][] = new int[rows][columns];
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                array[i][j] = input.nextInt();
            }
        }
        for(int f=0; f<array.length; f++){
            for(int b=0; b<array[f].length; b++){
                System.out.print(array[f][b] + " ");
            }
            System.out.println();
        }

    }
}
