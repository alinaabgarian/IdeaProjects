public class Main {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(3, 7);
        r1.printInfo();

        System.out.println();

        Circle c1 = new Circle(5);
        c1.printInfo();

        System.out.println();

        Circle c2 = new Circle(5);

        if(c1.equals(c2)){
            System.out.println();
            System.out.println("The circles are equal");
            System.out.println();
        }


        Cube cube1 = new Cube(6);
        cube1.printInfo();

        System.out.println();

        Cylinder cyl1 = new Cylinder(2, 7);
        cyl1.printInfo();

    }
}