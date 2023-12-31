public class Pet {
    int age;
    float weight;
    float height;
    String color;

    public void sleep(){
        System.out.println("Good night! Till tomorrow");
    }

    public void eat(){
        System.out.println("I'm very hungry, let's eat some chips!");
    }

    public String say(String aWord){
        String petResponse = "Well, ok!!" + aWord;
        return petResponse;
    }
}

