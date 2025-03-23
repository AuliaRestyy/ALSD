import java.util.Scanner;
public class StudentDemo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int totalStudent = sc.nextInt();
        sc.nextLine();

        if (totalStudent < 0) {
            System.out.println("Invalid total students");
        } else {
            TopStudent04 topStudents = new TopStudent04(totalStudent);

            // topStudents.add(new Student04("2201", "Alice", "A", 3.9));
            // topStudents.add(new Student04("2202", "Bob", "B", 3.7));
            // topStudents.add(new Student04("2203", "Charlie", "C", 3.8));
            // topStudents.add(new Student04("2204", "David", "D", 3.6));
            // topStudents.add(new Student04("2205", "Eve", "E", 4.0));

            for (int i = 0; i < totalStudent; i++) {
                System.out.println("Enter details for student number #" + (i+1));
                System.out.print("NIM: ");
                String nim = sc.nextLine();

                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Class: ");
                String studentClass = sc.nextLine();

                System.out.print("GPA: ");
                double gpa = sc.nextDouble();
                sc.nextLine();

                topStudents.add(new Student04(nim, name, studentClass, gpa));
            }

            System.out.println("Original student list:");
            topStudents.print();

            topStudents.bubbleSort();
            System.out.println("Sorted student list (by GPA, descending):");
            topStudents.print();

            topStudents.selectionSort();
            System.out.println("Sorted student list (by GPA, ascending) using Selection Sort:");
            topStudents.print();

            topStudents.insertionSort();
            System.out.println("Sorted student list (by GPA, descending) using Insertion Sort:");
            topStudents.print();
        }
    }
}
