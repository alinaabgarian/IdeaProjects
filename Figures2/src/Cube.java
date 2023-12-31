public class Cube extends Figure3D{

    double length;

    Cube(double length){
        this.length = length;
    }

    @Override
    double findVolume(){
        double volume = length * length * length;
        return volume;
    }

    @Override
    double findPerimeter(){
        double perimeter = 12 * length;
        return perimeter;
    }

    @Override
    double findArea(){
        double surfaceArea = 6 * length * length;
        return surfaceArea;
    }

    @Override
    void printInfo(){
        System.out.println("Cube");
        System.out.println("Area: " + findArea());
        System.out.println("Perimeter: " + findPerimeter());
        System.out.println("Volume: " + findVolume());
    }
}
