public class Main4 {
    public static void main(String[] args) {
        Car[] cars = new Car[3];

        Car Mick = new Car(312, "Dourn", "X", 2023, "White", 200);
        cars[0] = Mick;
        Car Nat = new Car(243, "Dourn", "L", 2025, "Blue", 500);
        cars[1] = Nat;
        Car Tat = new Car(432, "Firn", "L", 2023, "Green", 300);
        cars[2] = Tat;

        Main4 object = new Main4();

        int carsOfBrand = object.carsOfBrand(cars, "Dourn");
        System.out.println();
        System.out.println();

        int carsOfModelAndYear = object.carsOfModelAndYear(cars, "L", 2023);
        System.out.println();
        System.out.println();

        int carsWithSetReleaseAndPrice = object.carsWithSetReleaseAndPrice(cars, 2023, 250);

    }

    public int carsOfBrand(Car[] cars, String brandName){
        for(int a = 0; a<cars.length; a++){
            if(cars[a].getMark().equals(brandName)){
                System.out.println(cars[a]);
            }
        }
        return 2;
    }

    public int carsOfModelAndYear(Car[] cars, String modelName, int years ){
        for(int a = 0; a<cars.length; a++){
            if(cars[a].getModel().equals(modelName) && cars[a].getYearOfRelease()>years){
                System.out.println(cars[a]);
            }
        }
        return 5;
    }

    public int carsWithSetReleaseAndPrice(Car[] cars, int yearRelease, int price){
        for(int a = 0; a<cars.length; a++){
            if(cars[a].getYearOfRelease() == yearRelease){
                if(cars[a].getPrice() > price){
                    System.out.println(cars[a]);
                }
            }
        }
        return 7;
    }
}
