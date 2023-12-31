public class ArrayTask4 {
    public static void main(String[] args) {
        int array[]=new int[20];
        for(int p=0; p<array.length; p++){
            array[p]=(int) (Math.random() * 100);
        }
        for(int k=0; k<array.length; k++){
            System.out.print(array[k]+" ");
        }
        System.out.println(" ");

        for(int index=0; index<array.length; index+=2){
            int a=array[index];
            int b=array[index+1];
            array[index]=b;
            array[index+1]=a;
        }

        for(int r=0; r<array.length; r++){
            System.out.print(array[r]+" ");
        }
    }
}
