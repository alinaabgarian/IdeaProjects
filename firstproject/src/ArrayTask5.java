public class ArrayTask5 {
    public static void main(String[] args) {
        int d=7;
        int prices[] = new int[d];
        prices[0] = 1050;
        prices[1] = 2000;
        prices[2] = 900;
        prices[3] = 1500;
        prices[4] = 895;
        prices[5] = 2700;
        prices[6] = 1000;
        for (int k = 0; k < prices.length; k++) {
            System.out.print(prices[k] + " ");
        }
        System.out.println(" ");
        int discounts[] = new int[d];
        discounts[0]=10;
        discounts[1]=20;
        discounts[2]=5;
        discounts[3]=15;
        discounts[4]=2;
        discounts[5]=25;
        discounts[6]=2;

        int pricesAfterDiscount[]=new int[d];

        for(int u=0; u<pricesAfterDiscount.length; u++){
            pricesAfterDiscount[u]=prices[u]-(prices[u]*discounts[u]/100);
        }

        for (int c = 0; c < pricesAfterDiscount.length; c++) {
            System.out.print(pricesAfterDiscount[c] + " ");
        }

    }
}
