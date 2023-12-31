public class LoopTask7 {
    public static void main(String[] args) {

        int a = 100;
        for (int i = 1; i <= a; i++) {
            int space = a-i;
            int p =1;
            while (p<=space) {
                System.out.print(" ");
                p++;
            }

        int k = 1;
        while (k <= i*2-1) {

            System.out.print("*");
            k++;
            }

            System.out.println();



        }
    }
}
