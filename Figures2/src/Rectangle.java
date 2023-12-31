public class Rectangle extends Figure{

    double length;
    double width;


    Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    @Override
    double findArea(){
        double area = length * width;
        return area;
    }


    @Override
    double findPerimeter(){
        double perimeter = 2 * length + 2 * width;
        return perimeter;
    }

    @Override
    void printInfo(){
        System.out.println("Rectangle");
        System.out.println("Area: " + findArea());
        System.out.println("Perimeter: " + findPerimeter());
    }
}
