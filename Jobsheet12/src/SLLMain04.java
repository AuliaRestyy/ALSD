import java.util.Scanner;
public class SLLMain04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList04 sll = new SingleLinkedList04();

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Student #" + (i+1));
            System.out.print("NIM: ");
            String nim = sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Class: ");
            String className = sc.nextLine();

            System.out.print("GPA: ");
            double gpa = sc.nextDouble();

            Student04 std = new Student04(nim, name, className, gpa);
            sll.addLast(std);
        }

        Student04 std1 = new Student04("001", "Student 1", "TI-1I", 3.89);
        Student04 std2 = new Student04("002", "Student 2", "TI-1I", 3.45);
        Student04 std3 = new Student04("003", "Student 3", "TI-1I", 3.20);
        Student04 std4 = new Student04("004", "Student 4", "TI-1I", 3.00);

        sll.print();
        sll.addFirst(std4);
        sll.print();
        sll.addLast(std1);
        sll.print();
        sll.insertAfter(std3, "Student 4");
        sll.insertAt(2, std2);
        sll.print();

        System.out.println("Data at index 1 is:");
        Student04 data = sll.getData(1);
        data.print();

        int idx = sll.indexOf("Student 1");
        System.out.println("Student 1 is located at index: " + idx);

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();

    }
}
