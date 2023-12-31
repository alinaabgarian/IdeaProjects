public class LoopTask5 {
    public static void main(String[] args) {
        int n=1;
        int sum=0;

        while(n<=333){
            if(n%10==9){
                System.out.println(n);
                sum+=1;
            }
            else if(n%100==0){
                System.out.println(n);
                sum+=1;
            }
            n++;
        }
        System.out.println("There are "+sum+" tickets that end in 00 or 9");
    }
}
