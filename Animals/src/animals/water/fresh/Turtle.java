package animals.water.fresh;

public class Turtle {
    private String name;
    private int age;
    private int weight;

    public Turtle(String turtleName, int turtleAge, int turtleWeight){
        name = turtleName;
        age = turtleAge;
        weight = turtleWeight;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public int getWeight(){
        return this.weight;
    }

    public void doSomething(){
        System.out.println("I'm a turtle! My name is "+name+". I weigh "+weight+ "kg and I am "+ age+" years old.");
    }

}
