package animals.water.salty;

public class Turtle {

    private String name;
    private int age;
    private int weight;

    public Turtle(String turtleName, int turtleAge, int turtleWeight){
        name = turtleName;
        age = turtleAge;
        weight =turtleWeight;

    }

    public void doSomething(){
        System.out.println("I'm a sea turtle! My name is "+name+". I weigh "+weight+ "kg and I am "+ age+" years old.");
    }
}
