package Package;

public class Car {
    private int id;
    private String mark;
    private String model;
    private int yearOfRelease;
    private String color;
    private int price;

    public Car(int id, String mark, String model, int yearOfRelease, String color, int price){
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.yearOfRelease = yearOfRelease;
        this.color = color;
        this.price = price;
    }

    public String getMark(){
        return this.mark;
    }

    @Override
    public String toString() {
        return "Package.Car{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
