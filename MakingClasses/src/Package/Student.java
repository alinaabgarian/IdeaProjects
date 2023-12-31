package Package;

public class Student {

    private int id;
    private String surname;
    private String name;
    private String middleName;
    private int yearOfBirth;
    private String address;
    private int phone;
    private String school;
    private int clazz;

    public Student(int id, String surname, String name, String middleName, int yearOfBirth, String address, int phone, String school ,int clazz){

        this.id = id;
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
        this.phone = phone;
        this.school = school;
        this.clazz = clazz;
    }

    public String getFullName(){
        return this.name+" "+middleName+" "+surname;
    }

    public String getSchool(){
        return this.school;
    }

    public int getGradeLevel(){
        return this.clazz;
    }

    public int getYearOfBirth(){
        return this.yearOfBirth;
    }
}
