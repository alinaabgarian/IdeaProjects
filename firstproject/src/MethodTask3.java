public class MethodTask3 {
    public static void main(String[] args) {
        MethodTask3 object = new MethodTask3();
        String squareThenAdd = object.squareThenAdd(7);
        System.out.println(squareThenAdd);
    }

    String squareThenAdd(int number){
        int square = number * number;
        int addFour = square + 4;

        return square+" "+addFour;

    }
}
