public class TwoDimenArrayTask2 {
    public static void main(String[] args) {
        char  array[][] = new char[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i==j || i+j==4){
                    array[i][j]='x';
                }
                else{
                    array[i][j]=' ';
                }
            }
        }
        for(int f=0; f<array.length; f++){
            for(int b=0; b<array[f].length; b++){
                System.out.print(array[f][b] + " ");
            }
            System.out.println();
        }

    }
}