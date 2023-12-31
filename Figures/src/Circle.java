public class Circle {

    int radius;

    Circle(int radius){
        this.radius = radius;
    }

    public void findArea(int radius){

        double area = 3.14*radius*radius;
        System.out.println(area);


    }

    public void findCircumfrence(int radius){

        double circumference = 3.14 * 2 * radius;
        System.out.println(circumference);


    }
}
