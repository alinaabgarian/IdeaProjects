package Package;

public class Patient {

    private  String surname;
    private String name;
    private String middleName;
    private String address;
    private int phone;
    private int numberOfMedicalRecord;
    private String diagnosis;

    public Patient(String surname, String name, String middleName, String address, int phone, int numberOfMedicalRecord, String diagnosis){
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.address = address;
        this.phone = phone;
        this.numberOfMedicalRecord = numberOfMedicalRecord;
        this.diagnosis = diagnosis;
    }

    public String getDiagnosis(){
        return this.diagnosis;
    }

    public int getNumberOfMedicalRecord(){
        return this.numberOfMedicalRecord;
    }
}
