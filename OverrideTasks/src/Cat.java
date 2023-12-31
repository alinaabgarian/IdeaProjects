public class Cat extends Pets{

    public Cat(){}

    public void getName(){
        System.out.println("I am a cat");

    }

    @Override
    public void getChild(){
        System.out.println("Cat breeds with cat");
    }

    @Override
    public String getSpecies(){
        return "Cat";
    }
}
