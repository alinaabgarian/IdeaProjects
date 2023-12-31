public class MethodTask2 {

    public static void main(String[] args) {
        MethodTask2 object = new MethodTask2();
        String evenOrNot = object.evenOrNot(228);
        System.out.println(evenOrNot);
    }

    String evenOrNot(int number){

        if(number%2 == 0){
            return "True";
    }
        return "False";
}
}
