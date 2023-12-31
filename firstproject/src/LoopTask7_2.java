public class LoopTask7_2 {

    public static void main(String[] args) {

        int a = 10;
        for (int i = 1; i <= a; i++) {
            int space = a-i;

            for ( int p=1; p<=space; p++) {
                System.out.print(" ");
            }

            for (int k=1; k <= i*2-1; k++) {
                System.out.print("*");
            }

            System.out.println();



        }
    }
}
