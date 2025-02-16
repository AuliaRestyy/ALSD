import java.util.Scanner;
public class Fuction {
    static Scanner sc = new Scanner(System.in);
    static int[][] royal = {{10, 5, 15, 7}, {6, 11, 9, 12}, {2, 10, 10, 5}, {5, 7, 12, 9}};
    static double[] prices = {75000, 50000, 60000, 10000};
    static String[] flowers = {"Aglonema", "Keladi", "Alocasia", "Mawar"};

    static void displayIncome() {
        System.out.println("======================");
        System.out.print("Enter the number of store (1-4): ");
        int storeNum = sc.nextInt();

        double finalPrice = 0;
        for (int i = 0; i < prices.length; i++) {
            double totPrice = royal[storeNum-1][i] * prices[i];
            System.out.println(flowers[i] + ": " + totPrice);
            finalPrice += totPrice;
        }

        System.out.println("Store income: " + finalPrice);
    }

    static void stockRoyal4() {
        int[] reduction = {1, 2, 0, 5};
        System.out.println("======================");
        System.out.println("Final Stocks in Royal Garden 4");
        for (int i = 0; i < prices.length; i++) {
            int finStock = royal[3][i] - reduction[i];
            System.out.println(flowers[i] + ": " +  finStock);
        }
    }

    public static void main(String[] args) {
        System.out.println("Royal Garden Program");
        System.out.println("======================");
        System.out.println("1. Display Income branch");
        System.out.println("2. Display stock on the Royal Graden 4");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                displayIncome();
                break;
            case 2:
                stockRoyal4();
                break;
            default:
                System.out.println("Invalid choice, Try again!");
                break;
        }

    }
}
