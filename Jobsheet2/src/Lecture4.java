public class Lecture4 {
    String lecturerID;
    String name;
    boolean status;
    int startYear;
    String expertisedField;
    int tenure;

    public Lecture4(){

    }

    public Lecture4(String id, String name, boolean status, int start, String fields) {
        lecturerID = id;
        this.name = name;
        this.status = status;
        startYear = start;
        expertisedField = fields;
    }

    void print(){
        System.out.println("Lecturer ID : " + lecturerID);
        System.out.println("Name: " + name);
        System.out.println("Status : " + (status ? "Active" : "Inactive"));
        System.out.println("Expertised Field : " + expertisedField);
        System.out.println("Start year : " + startYear);
        System.out.println("Tenure : " + tenure);
    }

    void setStatus(boolean newStatus){
        status = newStatus;
    }

    int calculateTenure(int yearNow){
        return tenure = yearNow - startYear;
    }

    void changeExpertiseField(String newField){
        expertisedField = newField;
    }
}

