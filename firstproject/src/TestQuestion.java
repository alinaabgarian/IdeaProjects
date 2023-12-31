public class TestQuestion {
    public static void main(String[] args) {
        int array[] = new int[6];
        int a=0;
        for(int i=0; a<3; i++){
            array[i] = a++;
            if (i%2==0)
                a--;
        }
        System.out.println(array[1] + " " + array[4] + " " + array[2]);
        int result = array[1] + array[4] - array[2];
        System.out.println(result);
    }
}
