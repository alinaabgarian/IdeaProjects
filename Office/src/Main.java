public class Main {
    public static void main(String[] args) {
        /*Employee Erik = new Employee(123, "Erik");
        Employee Erik2 = new Employee(123, "Erik");

        boolean erikEqualsErik = Erik.equalTo(Erik2);
        if(erikEqualsErik){
            System.out.println("The employees are the same");
        }
        else{
            System.out.println("The employees are not the same");
        }

        System.out.println(Erik.getId() + " " + Erik.getName());*/

        Office a = new Office(1);
        Office b = new Office(2);
        Office c = new Office(3);

        Computer one = new Computer(7);
        Computer two = new Computer(8);
        Computer three = new Computer(9);
        Computer four = new Computer(10);
        Computer five = new Computer(11);
        Computer six = new Computer(12);
        Computer seven = new Computer(13);
        Computer eight = new Computer(14);
        Computer nine = new Computer(15);
        Computer ten = new Computer(16);


        Employee A = new Employee(132, "Aiden", a, three);
        Employee B = new Employee(312, "Bob", c, one);
        Employee C = new Employee(321, "Caden", a, two);

        SecurityGuard D = new SecurityGuard(546, "Derek", b, four);
        SecurityGuard E = new SecurityGuard(566, "Elliot", a, six);
        SecurityGuard F = new SecurityGuard(656, "Finley", c, five);
        SecurityGuard G = new SecurityGuard(756, "Garrett", c, seven);

        Courier H = new Courier(989, "Harry", b, ten);
        Courier I = new Courier(859, "Izzy", a, eight);
        Courier J = new Courier(970, "Jayden", b, nine);

        OfficeSupportEntity[] officeGuys = {A, B, C, D, E, F, G, H, I, J};
        ComputerSupportable[] computerGuys = {A, B, C, D, E, F, G, H, I, J};

        for(int t=0; t< officeGuys.length; t++){
            if(officeGuys[t].getOffice().equals(c)){
                System.out.println(officeGuys[t]);
            }
        }
        System.out.println();

        for(int j=0; j<computerGuys.length; j++){
            System.out.println(computerGuys[j].getComputer());
        }



    }
}