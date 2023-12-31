public class LoopTask6 {
    public static void main(String[] args) {
        int p=1;

        while(p<=1000){
            if(p%100==33){
                System.out.println("Present number "+p+" needs fixing!");
            }
            p++;
        }
    }
}
