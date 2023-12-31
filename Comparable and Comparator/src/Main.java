import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Book[] bookArray = {
                new Book("War and Piece volume 4", "Lev Tolstoy", 202),
                new Book("War and Piece volume 1", "Lev Tolstoy", 308),
                new Book("War and Piece volume 3", "Lev Tolstoy", 346),
                new Book("War and Piece volume 2", "Lev Tolstoy", 322),
                new Book("War and Piece epilogue", "Lev Tolstoy", 96),
                new Book("Fahrenheit 451", "Ray Bradbury", 256)
        };

        Arrays.sort(bookArray);

        for(int a=0; a< bookArray.length; a++){
            System.out.println(bookArray[a]);
        }
        System.out.println();



        Dog[] dogArray = {
                new Dog("Sparky", 5, 1, Breed.DACHSHUND),
                new Dog("Lucky", 2, 2, Breed.HOUND),
                new Dog("Bobik", 3, 1, Breed.BULLDOG),
                new Dog("Barbos", 7, 2,Breed.LAIKA)
        };

        Arrays.sort(dogArray, new DogComparator());

        for(Dog dog: dogArray){
            System.out.println(dog);
        }

        System.out.println();

        Car[] carArray = {
                new Car("Blue", "A", 2023),
                new Car("White", "X", 2019),
                new Car("Black", "B", 2022)
        };

        Arrays.sort(carArray, new CarComparator());

        for(Car car: carArray){
            System.out.println(car);
        }




    }
}