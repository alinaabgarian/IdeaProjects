import java.util.Scanner;

public class MethodTask7 {
    public static void main(String[] args) {
        MethodTask7 object = new MethodTask7();
        int firstInt = object.getInt();
        System.out.println(firstInt);

        int secondInt = object.getInt();
        System.out.println(secondInt);

        char getOperation = object.getOperation();
        System.out.println(getOperation);

        double calculator = object.calc(firstInt, secondInt, getOperation);
        System.out.println(calculator);

    }

    int getInt(){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        return number;


    }

    char getOperation(){
        Scanner sc = new Scanner(System.in);
        char opr = sc.next().charAt(0);

        System.out.println(opr);
        return opr;

    }

    double calc(int num1, int num2, char operation){
        int firstInt = num1;
        int secondInt = num2;
        char getOperation = operation;

        char operate = getOperation;
        switch(operate){
            case '+':
                return firstInt+secondInt;
            case '-':
                return firstInt-secondInt;
            case '*':
                return firstInt*secondInt;
            case '/':
                return firstInt/(double)secondInt;

        }

        return 0;



    }
}
