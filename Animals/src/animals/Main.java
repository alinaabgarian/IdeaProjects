package animals;

import animals.air.birds.Parrot;
import animals.air.others.Bat;
import animals.water.fresh.Turtle;
import animals.earth.aboveground.Cat;

public class Main {
    public static void main(String[] args) {
        Turtle Joe = new Turtle("Joe", 88, 500);
        Joe.doSomething();

        System.out.println(Joe.getAge());

        animals.water.salty.Turtle Crush = new animals.water.salty.Turtle("Crush", 100, 800);
        Crush.doSomething();

        System.out.println(" ");

        Parrot Dave = new Parrot("Dave", 2, 7);
        Dave.doSomething();

        System.out.println(Dave.getAge());

        Bat George = new Bat("George", 1, 1);
        George.doSomething();

        System.out.println(" ");

        Cat Luceria = new Cat("Luceria", 3, 6);
        Luceria.doSomething();




    }
}
