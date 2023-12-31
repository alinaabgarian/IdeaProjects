public class TwoDimenArrayTask5 {
    public static void main(String[] args) {

        int array[][] = new int[5][5];
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                array[i][j] = (int) (Math.random() * 100);
            }
        }
        for(int f=0; f<array.length; f++){
            for(int b=0; b<array[f].length; b++){
                System.out.print(array[f][b] + " ");
            }
            System.out.println();
        }


        for(int u=0; u<array.length; u++){
            for(int r=0; r<array[u].length; r++){
                int number = array[u][r];
                int sum = 0;
                for (int k=1; number>0; k++){
                    int remainder = number%10;
                    sum = sum+remainder;
                    number = number/10;
                }

                if(sum>7 && sum<13){
                    System.out.print(array[u][r]+"("+u+","+r+") ");
                }
            }
        }


    }
}
