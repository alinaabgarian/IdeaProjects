public class LoopTask3 {
    public static void main(String[] args) {
        int a=8;
        int b=1;
        int sum=0;
        while (b<a){
            System.out.print(b+" + ");
            sum=sum+b;
            b++;
        }
        sum+=a;
        System.out.print(a+" = "+sum);
    }
}
