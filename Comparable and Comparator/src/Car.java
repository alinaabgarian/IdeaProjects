public class Car {

    private String color;
    private String model;
    private int yearOfRelease;

    Car(String color, String model, int yearOfRelease){
        this.color = color;
        this.model = model;
        this.yearOfRelease = yearOfRelease;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                '}';
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}
