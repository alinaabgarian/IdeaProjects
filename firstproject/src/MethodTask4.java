public class MethodTask4 {
    public static void main(String[] args) {
        MethodTask4 object = new MethodTask4();
        String biggerThan69 = object.biggerThan69(69);
        System.out.println(biggerThan69);
    }

    String biggerThan69(int number){
        if (number>69){
            return "true";
        }
        return "false";
    }
}
