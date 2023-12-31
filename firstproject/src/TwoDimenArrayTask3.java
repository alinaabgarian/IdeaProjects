public class TwoDimenArrayTask3 {
    public static void main(String[] args) {
        int array[][] = new int[3][3];
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                array[i][j] = (int) (Math.random() * 10);

            }
        }

        for(int f=0; f<array.length; f++){
            for(int b=0; b<array[f].length; b++){
                System.out.print(array[f][b] + " ");

            }
            System.out.println();
        }

        for(int t=0; t<array.length; t++){
            for(int k=0; k<array[t].length; k++){
                if(t<k){
                    int temp = array[t][k];
                    array[t][k] = array[k][t];
                    array [k][t] = temp;
                }
            }
        }

        System.out.println(" ");

        for(int f=0; f<array.length; f++){
            for(int b=0; b<array[f].length; b++){
                System.out.print(array[f][b] + " ");

            }
            System.out.println();
        }
    }
}
