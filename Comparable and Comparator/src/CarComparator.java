import java.util.Comparator;

public class CarComparator implements Comparator<Car> {

    @Override
    public int compare(Car car1, Car car2){
        int difColor = car1.getColor().compareTo(car2.getColor());
        int difModel = car1.getModel().compareTo(car2.getModel());
        int difYearOfRelease = car1.getYearOfRelease() - car2.getYearOfRelease();

        if(difColor != 0){
            return difColor;
        }
        if(difModel != 0){
            return difModel;
        }
        return difYearOfRelease;

    }


}
