public class SwitchTask4 {
    public static void main(String[] args) {
        int red = 1;
        int blue = 2;
        int white = 3;

        int a = white;

        switch (a) {

            case 1:
                System.out.print("You are bright and ambitious");
                break;
            case 2:
                System.out.print("You are calm and hardworking");
                break;
            case 3:
                System.out.print("You are kind and gentle");
                break;

            default:
                System.out.println("You are boring");
        }
    }

}
