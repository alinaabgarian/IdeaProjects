public class Task3 {
    public static void main(String[] args) {

        printMatrix(2, 3, "8");
        printMatrix(2, 3, (Object) 8);
        printMatrix(2, 3, 8);
        printMatrix(2, 3, (byte) 8);
        printMatrix(2, 3, (long) 8);
        printMatrix(2, 3, (short) 8);
        printMatrix(2, 3, (Number) 8);
        printMatrix(2, 3, (int) 8);
        printMatrix(2, 3, (Integer) 8);
        printMatrix(2, 3, (char) 8);

    }

    public static void printMatrix(int m, int n, Integer value){
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(int m, int n, char value){
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(int m, int n, byte value){
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(int m, int n, long value){
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(int m, int n, short value){
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(int m, int n, String value){
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(int m, int n, Number value){
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(int m, int n, Object value){
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print(value);
            }
            System.out.println();
        }
    }





}
