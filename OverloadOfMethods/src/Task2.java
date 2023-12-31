public class Task2 {
    public static void main(String[] args) {
        print((short) 1);
        print((Number) 1);
        print(1);
        print((Integer) 1);
        print((int) 1);
    }

    public static void print(double i){
        System.out.println("This is a double");
    }

    public static void print(Object i){
        System.out.println("This is an object");
    }

    public static void print(Integer i){
        System.out.println("This is an integer");
    }

}
