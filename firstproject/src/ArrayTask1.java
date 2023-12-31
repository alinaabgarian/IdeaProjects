import java.util.Scanner;
public class ArrayTask1 {
    public static void main(String[] args) {
        System.out.println("How long would you like this array to be? ");
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int array[]=new int[length];

        for(int a=0; a<array.length; a++){
            array[a]=(int) (Math.random() * 10);
        }

        for(int k=0; k<array.length; k++){
            System.out.println(array[k]);
        }

    }
}
