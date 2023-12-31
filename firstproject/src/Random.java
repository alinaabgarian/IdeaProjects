public class Random {
    public static void main(String[] args) {


        int Boss = (int) (Math.random() * 10);
        int Bublik = (int) (Math.random() * 10);

        if (Boss == 5) {
            Boss = Boss + 5;
        }
        if (Bublik == 5) {
            Bublik = Bublik + 5;
        }
        if (Boss == 9) {
            Boss = Boss - 3;
        }
        if (Bublik == 9) {
            Bublik = Bublik - 3;
        }
        System.out.println("Boss = " + Boss);
        System.out.println("Bublik = " + Bublik);

        if (Boss == 10) {
            System.out.println("Boss won!");
        }
        else if (Bublik == 10) {
            System.out.println("Bublik won!");
        } else {
            System.out.println("Mission failed :(");

        }
    }

}