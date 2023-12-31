public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.say();

        Tiger Tony = new Tiger("Tony", 2);
        Tony.say();

        Dog dog = new Dog("Dog", 1);
        dog.say();

        System.out.println(dog.name+" "+Tony.name);

    }
}