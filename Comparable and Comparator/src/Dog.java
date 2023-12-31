public class Dog {

    private String name;
    private int age;
    private int height;

    private Breed breed;

    Dog(String name, int age, int height, Breed breed){
        this.name = name;
        this.age = age;
        this.height = height;
        this.breed = breed;
    }

    @Override
    public String   toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", breed=" + breed + '}';
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public Breed getBreed(){
        return breed;
    }
}
