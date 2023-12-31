public class Main4 {
    public static void main(String[] args) {
        Car[] cars = new Car[3];

        Car Mick = new Car(312, "Dourn", "Xs", 2023, "White", 200);
        cars[0] = Mick;
        Car Nat = new Car(243, "Dourn", "L", 2025, "Blue", 500);
        cars[1] = Nat;
        Car Tat = new Car(432, "Firn", "L", 2023, "Green", 300);
        cars[2] = Tat;

        Main4 object = new Main4();

        int carsOfBrand = object.carsOfBrand(cars, "Dourn");

    }

    public int carsOfBrand(Car[] cars, String brandName){
        for(int a = 0; a<cars.length; a++){
            if(cars[a].getMark().equals(brandName)){
                System.out.println(cars[a]);
            }
        }
        return 2;
    }
}
