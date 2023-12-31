public class ForLoopTask3 {
    public static void main(String[] args) {

        int a = 10;
        int accumulator = 0;
        for(int k=1; k<=a; k++){
            int y = (int)(Math.random()*100);
            accumulator=accumulator+y;
            System.out.println(y);
        }
        System.out.println("The sum of the integers is "+accumulator);
    }
}
