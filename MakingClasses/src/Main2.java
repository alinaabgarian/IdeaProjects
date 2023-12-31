public class Main2 {
    public static void main(String[] args) {
        Patient[] patients = new Patient[3];

        Patient Cameron = new Patient("Cameron", "Allison", "Miley", "Nickel", 56378, 7935, "healthy");
        patients[0] = Cameron;

        Patient Chase = new Patient("Chase", "Robert", "Gary", "Baker", 45783, 9346, "lupus");
        patients[1] = Chase;

        Patient Foreman = new Patient("Foreman", "Eric", "Joshua", "Mazino", 34683, 8634, "lupus");
        patients[2] = Foreman;

        Main2 object = new Main2();

        int amountOfPatientsWithDiagnosis = object.amountOfPatientsWithDiagnosis(patients, "lupus");
        System.out.println(amountOfPatientsWithDiagnosis+" patients have lupus");

        int amountOfRecordNumbersInInterval = object.amountOfRecordNumbersInInterval(patients);
        System.out.println(amountOfRecordNumbersInInterval + " patients' record number is above 7000");
    }

    public int amountOfPatientsWithDiagnosis(Patient[] patients, String nameOfDiagnosis){
        int counter = 0;

        for(int a = 0; a<patients.length; a++){
            if(patients[a].getDiagnosis().equals(nameOfDiagnosis)){
                counter++;
            }
        }
        return counter;
    }

    public int amountOfRecordNumbersInInterval(Patient[] patients){
        int counter = 0;
        for(int a = 0; a < patients.length; a++){
            if(patients[a].getNumberOfMedicalRecord() > 7000){
                counter++;
            }
        }
        return counter;
    }


}
