import java.util.Scanner;
public class CourseSchedule {
    static Scanner sc = new Scanner(System.in);
    static int data = 0;
    static String[] courseName = new String[100];
    static int[] creditHours = new int[100];
    static int[] semester = new int[100];
    static String[] day = new String[100];

    static void DisplayMenu() {
        System.out.println("1. Enter courses");
        System.out.println("2. Display courses");
        System.out.println("3. Search course");
        System.out.println("4. Exit");
        System.out.print("Choose menu:");
    }

    static void EnterCourses() {
        String enter;
        do {
            System.out.print("Enter your course name: ");
            courseName[data] = sc.nextLine();
            System.out.print("Enter the credit hours: ");
            creditHours[data] = sc.nextInt();
            System.out.print("Enter the semester: ");
            semester[data] = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter the lecture day: ");
            day[data] = sc.nextLine();
            data++;

            System.out.print("Enter another course (y/n)? ");
            enter = sc.nextLine();
        } while (data < 100 && enter.equalsIgnoreCase("y"));
        
    }

    static void DisplayCourses() {
        System.out.println("1. Display all course");
        System.out.println("2. Display courses by day");
        System.out.println("3. Display courses by semester");
        System.out.print("Chose menu: ");
        int menuDisplay = sc.nextInt();
        sc.nextLine();

        switch (menuDisplay) {
            case 1:
                System.out.printf("%-40s%-15s%-15s%-15s\n", "Course Name", "Credit Hours", "Semester", "Lecture day");
                for (int i = 0; i < data; i++) {
                    System.out.printf("%-40s%-15s%-15s%-15s\n", courseName[i], creditHours[i], semester[i], day[i]);
                }
                break;
            case 2:
                System.out.print("Enter the day: ");
                String searchDay = sc.nextLine();
                System.out.printf("%-40s%-15s%-15s%-15s\n", "Course Name", "Credit Hours", "Semester", "Day");
               
                for (int i = 0; i < data; i++) {
                    if (day[i].equalsIgnoreCase(searchDay)) {
                        System.out.printf("%-40s%-15s%-15s%-15s\n", courseName[i], creditHours[i], semester[i], day[i]);
               
                    }
                }
                break;
            case 3:
                System.out.print("Enter the semester: ");
                int searchSemester = sc.nextInt();
                System.out.printf("%-40s%-15s%-15s%-15s\n", "Course Name", "Credit Hours", "Semester", "Day");
            
                for (int i = 0; i < data; i++) {
                    if (semester[i] == searchSemester) {
                        System.out.printf("%-40s%-15s%-15s%-15s\n", courseName[i], creditHours[i], semester[i], day[i]);
            
                    }
                }
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

    }

    static void SearchCourse() {
        System.out.print("Enter the course name: ");
        String nameEnter = sc.nextLine();
        System.out.printf("%-40s%-15s%-15s%-15s\n", "Course Name", "Credit Hours", "Semester", "Day");
        boolean found = false;
        for (int i = 0; i < data; i++) {
            if (courseName[i].equalsIgnoreCase(nameEnter)) {
                System.out.printf("%-40s%-15s%-15s%-15s\n", courseName[i], creditHours[i], semester[i], day[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Course not found");
        }
    }
    public static void main(String[] args) {
        int choice;
        do {
            DisplayMenu();
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    EnterCourses();
                    break;
                case 2:
                    DisplayCourses();
                    break;
                case 3:
                    SearchCourse();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
            
        } while (choice != 4);
        


    }
}
