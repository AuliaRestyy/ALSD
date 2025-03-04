import java.util.Scanner;
public class LectureDemo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of lecturers: ");
        int numLecturers = sc.nextInt(); 
        sc.nextLine();

        Lecturer4[] lecArray = new Lecturer4[numLecturers];

        for (int i = 0; i < numLecturers; i++) {
            System.out.println("Lecture " + (i+1));

            System.out.print("Name : ");
            String name = sc.nextLine();

            System.out.print("ID : ");
            String id = sc.nextLine();

            Boolean sex;
            while (true) {
            System.out.print("Gender (male/female) : ");
            String sexInput = sc.nextLine();
            if (sexInput.equalsIgnoreCase("male")) {
                sex = true;
                break;
            } else if (sexInput.equalsIgnoreCase("female")) {
                sex = false;
                break;
            } else {
                System.out.println("Invalid gender");
            }
            }

            System.out.print("Age : ");
            int age = sc.nextInt();
            sc.nextLine();

            lecArray[i] = new Lecturer4(id, name, sex, age);
        }

        System.out.println();

        for (Lecturer4 lecturer : lecArray) {
            lecturer.print();
            System.out.println();
        }
        
        LectureData4 lecturerData = new LectureData4();

        lecturerData.showAllLecturerData(lecArray);
        lecturerData.countLecturerByGender(lecArray);
        System.out.println();
        lecturerData.averageLecturerAgeByGender(lecArray);
        System.out.println();
        lecturerData.showOldestLecturerInfo(lecArray);
        System.out.println();
        lecturerData.showYoungestLecturerInfo(lecArray);
    } 
}
