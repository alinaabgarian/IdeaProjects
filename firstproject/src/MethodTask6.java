public class MethodTask6 {
    public static void main(String[] args) {
        MethodTask6 object = new MethodTask6();
        double distanceBetweenTwoPoints = object.distanceBetweenTwoPoints(0,0,3,4);
        System.out.println(distanceBetweenTwoPoints);
    }

     double distanceBetweenTwoPoints(int x1, int y1, int x2, int y2){
        int differencesOfXes = x2 - x1;
        System.out.println(differencesOfXes);
        int differencesOfYs = y2 - y1;
        System.out.println(differencesOfYs);

        int squareOfXes = differencesOfXes * differencesOfXes;
        System.out.println(squareOfXes);
        int squareOfYs = differencesOfYs * differencesOfYs;
        System.out.println(squareOfYs);

        int sumOfXesAndYs = squareOfXes + squareOfYs;
        System.out.println(sumOfXesAndYs);


        double distance = Math.sqrt(sumOfXesAndYs);


        return distance;

    }
}
