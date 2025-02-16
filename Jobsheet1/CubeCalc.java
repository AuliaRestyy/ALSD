
import java.util.Scanner;

public class CubeCalc {

    static Scanner sc = new Scanner(System.in);
    public static void displaymenu() {
        System.out.println("1. Calculate volume");
        System.out.println("2. Calculate surface area");
        System.out.println("3. Calculate perimeter");
        System.out.println("4. Exit");
        System.out.print("Choose menu: ");
    }

    static double volume() {
        System.out.print("Enter a number: ");
        double num = sc.nextDouble();
        double vol = num * num * num;
        return vol;
    }

    static double surfaceArea() {
        System.out.print("Enter a number: ");
        double num = sc.nextDouble();
        double surface = (num * num) * 6;
        return surface;
    }

    static double perimeter() {
        System.out.print("Enter a number: ");
        double num = sc.nextDouble();
        double perimeter = 12 * num;
        return perimeter;
    }
    public static void main(String[] args) {
        int choice;
        do {
            displaymenu();
            choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("The volume is " + volume());
                    break;
                case 2:
                    System.out.println("The surface area is " + surfaceArea());
                    break;
                case 3:
                    System.out.println("The perimeter is " + perimeter());
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
