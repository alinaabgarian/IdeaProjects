public class LinearSort {
    public static void main(String[] args) {

        int array[] = new int[9];

        for (int a = 0; a < array.length; a++) {
            array[a] = (int) (Math.random() * 10);
        }

        for (int k = 0; k < array.length; k++) {
            System.out.print(array[k] + "  ");
        }

        System.out.println(" ");


        for (int p = 0; p < array.length; p++) {
            int minimal = array[p];
            int indexMin = p;

            for (int e = p; e < array.length; e++) {
                if (array[e] < minimal) {
                    minimal = array[e];
                    indexMin = e;
                }
            }

            int temp = array[p];
            array[p] = array[indexMin];
            array[indexMin] = temp;

        }

        for (int r = 0; r < array.length; r++) {
            System.out.print(array[r] + "  ");
        }
    }
}


