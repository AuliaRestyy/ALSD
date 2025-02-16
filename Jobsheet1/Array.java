import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===============================");
        System.out.println("Calculate GPA Program");
        System.out.println("===============================");

        String[] courseName = {"Pancasila", "Information Techonology Concept", "Critical Thinking and Problem Solving", "Basic Mathematics", "English", "Basic Programming", "Basic Programming Lab", "K3"};
        double[] creditWeight = {2, 2, 2, 3, 2, 2, 3, 2};
        double[] grade = new double[courseName.length];
        String[] letterGrade = new String[courseName.length];
        double[] bobotNilai = new double[courseName.length];

        for (int i = 0; i < courseName.length; i++) {
            while (true) {
                System.out.print("Enter your numerical grade for " + courseName[i] + " course: ");
                grade[i] = sc.nextDouble();

                if (grade[i] < 0 || grade[i] > 100) {
                    System.out.println("Invalid grade");
                } else {
                    break;
                }
            }

            if (80 < grade[i] && grade[i] <= 100) {
                letterGrade[i] = "A";
                bobotNilai[i] = 4;
            } else if (73 < grade[i] && grade[i] <= 80) {
                letterGrade[i] = "B+";
                bobotNilai[i] = 3.5;
            } else if (65 < grade[i] && grade[i] <= 73) {
                letterGrade[i] = "B";
                bobotNilai[i] = 3;
            } else if (60 < grade[i] && grade[i] <= 65) {
                letterGrade[i] = "C+";
                bobotNilai[i] = 2.5;
            } else if (50 < grade[i] && grade[i] <= 60) {
                letterGrade[i] = "C";
                bobotNilai[i] = 2;
            } else if (39 < grade[i] && grade[i] <= 50) {
                letterGrade[i] = "D";
                bobotNilai[i] = 1;
            } else {
                letterGrade[i] = "E";
                bobotNilai[i] = 0;
            }
        }

        System.out.println("===============================");
        System.out.println("Grade Conversion Result");
        System.out.println("===============================");

        System.out.printf("%-40s%-20s%-20s%-15s\n", "Courses", "Numerical Grade", "Letter Grade", "Bobot Nilai");
        for (int i = 0; i < courseName.length; i++) {
            System.out.printf("%-40s%-20s%-20s%-15s\n", courseName[i], grade[i], letterGrade[i], bobotNilai[i]);
        }

        double totGrade = 0;
        for (int i = 0; i < courseName.length; i++) {
            double finalGrade = bobotNilai[i] * creditWeight[i];
            totGrade += finalGrade;
        }

        double totCredit = 0;
        for (int i = 0; i < courseName.length; i++) {
            totCredit += creditWeight[i];
        }

        System.out.println(totGrade);
        System.out.println(totCredit);

        double gpa = totGrade / totCredit;
        System.out.println("===============================");
        System.out.printf("GPA: %.2f\n", gpa);
        System.out.println("===============================");

    }
}
