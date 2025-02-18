import java.util.Scanner;
public class Array {
    static double getGrade(String courseName) {
        Scanner sc = new Scanner(System.in);
        double grade;
        while (true) {
            System.out.print("Enter your numerical grade for " + courseName + " course: ");
            grade = sc.nextDouble();

            if (grade < 0 || grade > 100) {
                System.out.println("Invalid grade");
            } else {
                break;
            }
        }
        return grade;
    }

    static double convertGrade(double grade) {
        double result;

        if (80 < grade && grade <= 100) {
            result = 4; 
        } else if (73 < grade && grade <= 80) {
            result = 3.5; 
        } else if (65 < grade && grade <= 73) {
            result = 3; 
        } else if (60 < grade && grade <= 65) {
            result = 2.5; 
        } else if (50 < grade && grade <= 60) {
            result = 2; 
        } else if (39 < grade && grade <= 50) {
            result = 1; 
        } else {
            result = 0; 
        }
        return result;
    }

    static double calculateTotalGrade(double[] bobotNilai, double[] creditWeight) {
        double totGrade = 0;
        for (int i = 0; i < bobotNilai.length; i++) {
            totGrade += bobotNilai[i] * creditWeight[i];
        }
        return totGrade;
    }

    static double calculateTotalCredits(double[] creditWeight) {
        double totCredit = 0;
        for (double credit : creditWeight) {
            totCredit += credit;
        }
        return totCredit;
    }

    static void displayGradeResults(String[] courseName, double[] grade, String[] letterGrade, double[] bobotNilai) {
        System.out.println("===============================");
        System.out.println("Grade Conversion Result");
        System.out.println("===============================");
        System.out.printf("%-40s%-20s%-20s%-15s\n", "Courses", "Numerical Grade", "Letter Grade", "Bobot Nilai");
        for (int i = 0; i < courseName.length; i++) {
            System.out.printf("%-40s%-20s%-20s%-15s\n", courseName[i], grade[i], letterGrade[i], bobotNilai[i]);
        }
    }

    public static void main(String[] args) {

        System.out.println("===============================");
        System.out.println("Calculate GPA Program");
        System.out.println("===============================");

        String[] courseName = {"Pancasila", "Information Technology Concept", "Critical Thinking and Problem Solving", "Basic Mathematics", "English", "Basic Programming", "Basic Programming Lab", "K3"};
        double[] creditWeight = {2, 2, 2, 3, 2, 2, 3, 2};
        double[] grade = new double[courseName.length];
        String[] letterGrade = new String[courseName.length];
        double[] bobotNilai = new double[courseName.length]; 

        for (int i = 0; i < courseName.length; i++) {
            grade[i] = getGrade(courseName[i]);
            double result = convertGrade(grade[i]);
            bobotNilai[i] = result; 
            letterGrade[i] = result == 4 ? "A" : result == 3.5 ? "B+" : result == 3 ? "B" : result == 2.5 ? "C+" : result == 2 ? "C" : result == 1 ? "D" : "E";
        }

        displayGradeResults(courseName, grade, letterGrade, bobotNilai);

        double totGrade = calculateTotalGrade(bobotNilai, creditWeight);
        double totCredit = calculateTotalCredits(creditWeight);

        double gpa = totGrade / totCredit;
        System.out.println("===============================");
        System.out.printf("GPA: %.2f\n", gpa);
        System.out.println("===============================");
    }
}
