import org.w3c.dom.ls.LSOutput;

public class InterestingTask5_1 {

    private int potions;
    private int historyOfMagic;
    private int herbology;
    private int transfiguration;

    public InterestingTask5_1(int test1, int test2, int test3, int test4){
        potions = test1;
        historyOfMagic = test2;
        herbology = test3;
        transfiguration = test4;



    }

    public void doSomething(){
        int totalScore = potions+historyOfMagic+herbology+transfiguration;
        System.out.println("The total amount of exam points this student got was "+potions+"+"+historyOfMagic+"+"+herbology+"+"+transfiguration+" = "+totalScore+" points");
    }



    public static void main(String[] args) {
        InterestingTask5_1 Gary = new InterestingTask5_1(5, 4, 4, 2);
        Gary.doSomething();
    }








}
