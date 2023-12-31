public class Cylinder extends Figure3D{

    double radius;
    double height;

    Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    @Override
    double findVolume(){
        double volume = 3.14 * radius * radius * height;
        return volume;
    }

    @Override
    double findPerimeter() {
        return 0;
    }

    @Override
    double findArea(){
        double surfaceArea = 2 * 3.14 * radius * (radius+height);
        return surfaceArea;
    }

    @Override
    void printInfo(){
        System.out.println("Cylinder");
        System.out.println("Area: " + findArea());
        System.out.println("Perimeter: " + findPerimeter());
        System.out.println("Volume: " + findVolume());
    }
}
