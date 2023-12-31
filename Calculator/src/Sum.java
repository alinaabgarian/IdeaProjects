public class Sum {

    private double a;
    private double b;
    private double c;

    public Sum(){}

    public double sum(double first, double second){
        double s = first + second;
        return s;
    }

    public double sum(double first, double second, double third){
        double s = first + second + third;
        return s;
    }
}
