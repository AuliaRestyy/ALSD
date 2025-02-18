import java.util.Scanner;
public class Selection {
    static double inputGrade(String gradeType) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + gradeType + " Grade: ");
        return sc.nextDouble();
    }

    static double calcFinalGrade(double assignment, double quiz, double midterm, double finalExam) {
        return (0.2 * assignment) + (0.2 * quiz) + (0.3 * midterm) + (0.3 * finalExam);
    }

    static String[] gradeAndStatus(double finalGrade) {
        String[] result = new String[2];
        if (80 < finalGrade && finalGrade <= 100) {
            result[0] = "A";
            result[1] = "Congratulation You Pass";
        } else if (73 < finalGrade && finalGrade <= 80) {
            result[0] = "B+";
            result[1] = "Congratulation You Pass";
        } else if (65 < finalGrade && finalGrade <= 73) {
            result[0] = "B";
            result[1] = "Congratulation You Pass";
        } else if (60 < finalGrade && finalGrade <= 65) {
            result[0] = "C+";
            result[1] = "Congratulation You Pass";
        } else if (50 < finalGrade && finalGrade <= 60) {
            result[0] = "C";
            result[1] = "Congratulation You Pass";
        } else if (39 < finalGrade && finalGrade <= 50) {
            result[0] = "D";
            result[1] = "You Fail";
        } else {
            result[0] = "E";
            result[1] = "You Fail";
        }
        return result;
    }

    static boolean isInvalidGrade(double assignment, double quiz, double midterm, double finalExam) {
        return assignment > 100 || assignment < 0 || quiz > 100 || quiz < 0 || midterm > 100 || midterm < 0 || finalExam > 100 || finalExam < 0;
    }

    public static void main(String[] args) {
        System.out.println("Calculating Final Grade Program");
        System.out.println("=================================");

        double assignment = inputGrade("Assignment");
        double quiz = inputGrade("Quiz");
        double midterm = inputGrade("Midterm");
        double finalExam = inputGrade("Final Exam");

        if (isInvalidGrade(assignment, quiz, midterm, finalExam)) {
            System.out.println("Invalid grade");
        } else {
            double finalGrade = calcFinalGrade(assignment, quiz, midterm, finalExam);
            
            String[] result = gradeAndStatus(finalGrade);
            String letterGrade = result[0];
            String status = result[1];
            System.out.println("=================================");
            System.out.println("=================================");
            System.out.println("Final Grade: " + finalGrade);
            System.out.println("Letter Grade: " + letterGrade);
            System.out.println("=================================");
            System.out.println("=================================");
            System.out.println(status);
        }
    }
}
