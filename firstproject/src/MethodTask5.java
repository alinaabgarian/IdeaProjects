public class MethodTask5 {
    public static void main(String[] args) {
        MethodTask5 object = new MethodTask5();
        int raisingToAPower = object.raisingToAPower(2, 6);
        System.out.println(raisingToAPower);
    }

    int raisingToAPower(int base, int power){
        int number = base;
        while(power > 1){
            number = number * base;
            power--;
        }
        return number;
    }
}
