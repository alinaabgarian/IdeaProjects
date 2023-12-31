import java.util.Scanner;

public class MainClass {
    public static void main(String[] args){
        /*double a =37989;
        double c = a % 2;
        System.out.println("Remainder is " + c);

        if(c==0){
            System.out.println(a + " is even");
        }else{
            System.out.println(a+ " is odd");
        }*/

        /*double a =37987;
        double c = a % 10;
        System.out.println("Remainder is " + c);

        if(c==7){
            System.out.println(a + " ends in a 7");
        }else{
            System.out.println(a+ " does not end in a 7");
        */

        /*double a =2000;
        boolean isDividedBy4 = (a % 4) == 0;
        boolean isNotDividedBy100 = (a % 100) != 0;
        boolean isDividedBy400 = (a % 400) ==0;

        if(isDividedBy4 & isNotDividedBy100 | isDividedBy400){
            System.out.println("YES");
        }else{
            System.out.println("NO");*/

        double a=1;
        double b=1;
        double c=2;

        boolean first= (a<=b) & (a<=c);
        boolean second= (b<=a) & (b<=c);
        boolean third= (c<=a) & (c<=b);

        if (first){
            System.out.println(a + " is the smallest number");
        }
        else if (second){
            System.out.println(b + " is the smallest number");
        }
        else if (third){
            System.out.println(c + " is the smallest number");
        }







    }

}

