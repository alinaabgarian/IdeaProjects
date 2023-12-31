public class ForLoopTask5 {
    public static void main(String[] args) {
        int a = 3;
        int accumalator = 1;
        for(int k=1; k<=a; k++){
            accumalator=accumalator*k;
        }
        System.out.println("The factorial of "+a+" is "+accumalator);
    }
}
