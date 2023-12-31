public class TwoDimenArrayTask4 {
    public static void main(String[] args) {
        int array[][] = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 90+10);
            }
        }

        int low = array[0][0];
        int indexOfLow1 = 0;
        int indexOfLow2 = 0;

        int high = array[0][0];
        int indexOfHigh1 = 0;
        int indexOfHigh2 = 0;

        for (int f = 0; f < array.length; f++) {
            for (int b = 0; b < array[f].length; b++) {
                if (array[f][b] < low) {
                    low = array[f][b];
                    indexOfLow1 = f;
                    indexOfLow2 = b;
                }
                else if(array[f][b] > high) {
                    high = array[f][b];
                    indexOfHigh1 = f;
                    indexOfHigh2 = b;
                }
            }

        }
        System.out.println("The lowest number is " + low);
        System.out.println("It is located in position " + indexOfLow1 + ", " + indexOfLow2);
        System.out.println(" ");

        System.out.println("The highest number is " + high);
        System.out.println("It is located in position " + indexOfHigh1 + ", " + indexOfHigh2);
        System.out.println(" ");

        boolean metMinOrMax = false;
        int counter = 0;

        for(int g=0; g< array.length; g++){
            for(int c=0; c<array[g].length; c++){

                if(g==indexOfLow1 && c==indexOfLow2){
                    metMinOrMax=!metMinOrMax;
                }

                else if(g==indexOfHigh1 && c==indexOfHigh2){
                    metMinOrMax=!metMinOrMax;
                }
                if(metMinOrMax){
                    counter++;
                }

            }
        }


        System.out.println();
        for(int f=0; f<array.length; f++){
            for(int b=0; b<array[f].length; b++){
                System.out.print(array[f][b] + " ");

            }
            System.out.println();
        }
        System.out.println(counter-1);
    }
}
