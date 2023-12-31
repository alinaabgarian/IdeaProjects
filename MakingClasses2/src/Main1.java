public class Main1 {

    public static void main(String[] args) {

        Student[] students = new Student[5];

        Student Bob = new Student(312, "Ruit", "Bob", "Lewis", 2011, "MapleStr", 648658, "Capo", 7);
        students[0] = Bob;
        Student Sam = new Student(422, "Nance", "Sam", "Bobby", 2009, "BirdStr", 8649, "Heter", 9);
        students[1] = Sam;

        Student Olivia = new Student(348, "Livey", "Olivia", "Rose", 2008, "BirdStr", 590475, "Capo", 10);
        students[2] = Olivia;

        Student Suzie = new Student(564, "Brack", "Suzie", "Ellen", 2008, "MapleStr", 346443, "Hobrin", 10);
        students[3] = Suzie;

        Student William = new Student(235, "Brack", "William", "Ross", 2008, "MapleStr", 5833456, "Hobrin", 10);
        students[4] = William;


        System.out.println(students[0]);

        System.out.println(Bob.getFullName());

        Main1 object = new Main1();
        int foundStudentsOfSchool = object.foundStudentsOfSchool(students, "Capo");
        System.out.println("There are " + foundStudentsOfSchool + " students that go to Capo");

        int foundStudentsOfGradeLevel = object.foundStudentsOfGradeLevel(students, 10);
        System.out.println("There are "+ foundStudentsOfGradeLevel + " students that are in 10th grade");

        int foundStudentsBornAfter = object.foundStudentsBornAfter(students, 2009);
        System.out.println("There are "+ foundStudentsBornAfter + " student(s) that were born after 2009");

        String[] namesOfSchools = object.namesOfSchools(students);

        for(int j=0; j<students.length; j++){
            System.out.print(students[j].getSchool() + " ");
        }

        System.out.println(" ");


    }

    public int foundStudentsOfSchool(Student[] students, String nameOfSchool) {
        int counter = 0;

        for (int a = 0; a < students.length; a++) {
            if (students[a].getSchool().equals(nameOfSchool)) {
                counter++;
            }
        }
        return counter;
    }

    public int foundStudentsOfGradeLevel(Student[] students, int gradeLevel) {
        int counter = 0;

        for (int a = 0; a < students.length; a++) {
            if (students[a].getGradeLevel() == gradeLevel) {
                counter++;
            }
        }
        return counter;
    }

    public int foundStudentsBornAfter(Student[] students, int yearBorn){
        int counter = 0;

        for(int a =0; a < students.length; a++){
            if(students[a].getYearOfBirth() > yearBorn){
                counter++;
            }
        }
        return counter;
    }



    public String[] namesOfSchools(Student[] students){

        String[] schools = new String[students.length];

        for(int a = 0; a < students.length; a++){
            schools[a] = students[a].getSchool();
        }

        return schools;



    }
}
