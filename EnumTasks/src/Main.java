public class Main {
    public static void main(String[] args) {

        SchoolSubjects[] values = SchoolSubjects.values();

        for(int a=0; a< values.length; a++){
            System.out.println(values[a].name());
            System.out.println(values[a].getisExamable());
            System.out.println();
        }


    }
}