public class Random2 {
    public static void main(String[] args) {
        int ticket = (int) (Math.random() * 50);

        if (ticket == 25) {
            System.out.println("Iron Man won, he had ticket " +ticket);
        } else if (ticket == 14) {
            System.out.println("Thor won, he had ticket " + ticket);
        } else {
            System.out.println("Neither won, the ticket was " + ticket);
        }
    }
}