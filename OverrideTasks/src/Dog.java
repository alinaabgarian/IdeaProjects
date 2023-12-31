public class Dog extends Pets{

    Dog(){}

    @Override
    public void getChild(){
        System.out.println("Dog breeds with dog");
    }

    @Override
    public String getSpecies(){
        return "Dog";
    }
}
