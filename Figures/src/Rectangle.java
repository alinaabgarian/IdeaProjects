public class Rectangle extends Figure {

    int length;jhu8/9uhjjjjjjjjjidth;

    Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public void findArea(int length, int width){
        int area = length * width;
        System.out.println(area);
    }


    @Override
    double findPerimeter(int length, int width){
        int perimeter = 2 * length + 2 * width;
        return perimeter;
    }
}
