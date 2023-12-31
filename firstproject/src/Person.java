public class Person {

    static int a;
    int b;

    public static void main(String[]args){
        Person person1 = new Person();
        person1.a = 10;
        person1.b = 10;

        Person person2 = new Person();
        person2.a = 20;
        person2.b = 20;

        System.out.println(person1.a);
        System.out.println(person1.b);
        System.out.println(person2.a);
        System.out.println(person2.b);

    }





}
