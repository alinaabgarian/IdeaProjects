public class Main {
    public static void main(String[] args) {

        Pets[] pets = new Pets[3];

        Cat cat = new Cat();
        cat.getName();
        pets[0] = cat;


        Whale whale = new Whale();
        whale.getName();
        pets[1] = whale;

        cat.getChild();

        Dog dog = new Dog();
        dog.getChild();
        pets[2] = dog;
        System.out.println("");

        for(int a = 0; a<pets.length; a++){
            System.out.print(pets[a].getSpecies()+"  ");;
        }

    }
}