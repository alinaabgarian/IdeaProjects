package animals.air.others;

public class Bat {

    private String name;
    private int age;
    private int weight;

    public Bat(String batName, int batAge, int batWeight){
        name = batName;
        age = batAge;
        weight = batWeight;

    }

    public void doSomething(){
        System.out.println("I'm a bat! My name is "+name+". I weigh "+weight+ "kg and I am "+ age+" year(s) old.");
    }
}
