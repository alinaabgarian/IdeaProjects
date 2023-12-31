package animals.earth.aboveground;

public class Cat {

    private String name;
    private int age;
    private int weight;

    public Cat(String catName, int catAge, int catWeight){
        name = catName;
        age = catAge;
        weight = catWeight;
    }

    public void doSomething(){
        System.out.println("I'm a cat! My name is "+name+". I weigh "+weight+ "kg and I am "+ age+" years old.");
    }

    Cat cat3 = new Cat("cat3", 12, 9);

}
