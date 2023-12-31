public class InterestingTask3 {
    public static void main(String[] args) {
        int typingSpeed=120;
        int months = 0;

        while(typingSpeed<1060){
            months++;
            typingSpeed = typingSpeed+2;
        }

        System.out.println("It takes him "+months+" months!");
    }
}
