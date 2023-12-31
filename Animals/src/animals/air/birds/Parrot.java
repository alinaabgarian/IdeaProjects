package animals.air.birds;

public class Parrot {
    private String name;
    private int age;
    private int weight;

    public Parrot(String parrotName, int parrotAge, int parrotWeight){
        name = parrotName;
        age = parrotAge;
        weight = parrotWeight;
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
        System.out.println("I'm a parrot! My name is "+name+". I weigh "+weight+ "kg and I am "+ age+" years old.");
    }
}
