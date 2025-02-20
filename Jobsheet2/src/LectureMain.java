public class LectureMain {
    public static void main(String[] args) {
        Lecture4 lecture1 = new Lecture4("123456789", "Imam Fahrur Rozi", true, 2000, "Programming");
        lecture1.calculateTenure(2025);
        lecture1.print();

        Lecture4 lecture2 = new Lecture4();
        lecture2.lecturerID = "987654321";
        lecture2.name = "Afif Hendrawan";
        lecture2.status = false;
        lecture2.startYear = 2010;
        lecture2.calculateTenure(2025);
        lecture2.expertisedField = "Data Scientist";
        lecture2.print();
        lecture2.changeExpertiseField("Data Engineering");
        lecture2.setStatus(true);
        lecture2.print();
    }
}
