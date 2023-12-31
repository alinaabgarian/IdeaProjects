public class IfTask5 {
    public static void main(String[] args) {

        double a = 134;

        boolean greaterThan1 = a>1;
        boolean equalTo1 = a==1;

        if(greaterThan1){
            System.out.println(a + " rubles");
        }
        else if(equalTo1){
            System.out.print(a + " ruble");
        }
    }
}
