public class MethodTask1 {

    public static void main(String[] args) {
        MethodTask1 object = new MethodTask1();
        int biggerNumber = object.findBiggerNumber(228, 228);
        System.out.println(biggerNumber);


    }

    int findBiggerNumber(int first, int second){

        if(first>second){
            return first;
        }
        else if(first<second){
            return second;
        }
        return first;
    }
}
