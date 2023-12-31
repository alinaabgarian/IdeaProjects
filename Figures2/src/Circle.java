import java.util.Objects;

public class Circle extends Figure{

    double radius;

    Circle(int radius){
        this.radius = radius;
    }


    @Override
    double findArea(){
        double area = 3.14*radius*radius;
        return area;
    }

    @Override
    double findPerimeter(){
        double circumference = 3.14 * 2 * radius;
        return circumference;
    }

    @Override
    void printInfo(){
        System.out.println("Circle");
        System.out.printf("Area: %.1f\n" , findArea());
        System.out.printf("Perimeter: %.1f" , findPerimeter());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }


}
