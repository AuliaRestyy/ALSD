import java.util.Scanner;
public class Selection {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculating Final Grade Program");
        System.out.println("=================================");
        System.out.print("Enter Assignment Grade: ");
        double assignment = sc.nextDouble();

        System.out.print("Enter Quiz Grade: ");
        double quiz = sc.nextDouble();

        System.out.print("Enter Midterm Grade: ");
        double midterm = sc.nextDouble();

        System.out.print("Enter Final Exam Grade: ");
        double finalExam = sc.nextDouble();

        double finalGrade = (0.2 * assignment) + (0.2 * quiz) + (0.3 * midterm) + (0.3 * finalExam);
        String letterGrade;
        String status;

        if (80 < finalGrade && finalGrade <= 100) {
            letterGrade = "A";
            status = "Congratulation You Pass";
        } else if (73 < finalGrade && finalGrade <= 80) {
            letterGrade = "B+";
            status = "Congratulation You Pass";
        } else if (65 < finalGrade && finalGrade <= 73) {
            letterGrade = "B";
            status = "Congratulation You Pass";
        } else if (60 < finalGrade && finalGrade <= 65) {
            letterGrade = "C+";
            status = "Congratulation You Pass";
        } else if (50 < finalGrade && finalGrade <= 60) {
            letterGrade = "C";
            status = "Congratulation You Pass";
        } else if (39 < finalGrade && finalGrade <= 50) {
            letterGrade = "D";
            status = "You Fail";
        } else {
            letterGrade = "E";
            status = "You Fail";
        } 

        System.out.println("=================================");

        if (assignment > 100 || assignment < 0 || quiz > 100 || quiz < 0 || midterm > 100 || midterm < 0 || finalExam > 100 || finalExam < 0) {
            System.out.println("Invalid grade");
        } else {
            System.out.println("Final Grade: " + finalGrade);
            System.out.println("Letter Grade: " + letterGrade);
            System.out.println("=================================");
            System.out.println("=================================");
            System.out.println(status);
        }
    }
}
