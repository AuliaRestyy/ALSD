public class StudentMain {
    public static void main(String[] args) {
        Student4 student1 = new Student4();
        student1.studentID = "244107020015";
        student1.name = "Tiara";
        student1.className = "TI- 1I";
        student1.gpa = 3.8;
        student1.print();
        student1.changeClass("TI-2I");
        student1.updateGPA(3.9);
        student1.print();

        Student4 student2 = new Student4("244107020115", "Rizky", "TI-1I", 3.5);
        student2.updateGPA(3.3);
        student2.print();

        Student4 studentResty = new Student4("244107020015", "Resty", "TI-1I", 4);
        studentResty.print();
    }
}
