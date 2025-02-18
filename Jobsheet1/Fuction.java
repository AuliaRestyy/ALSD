import java.util.Scanner;
public class Fuction {
    static Scanner sc = new Scanner(System.in);
    
    static void displayIncome(int[][] stocks, double[] prices, String[] flowers, String[] branches) {
        System.out.println("======================");
        for (int i = 0; i < branches.length; i++) {
            System.out.println("Income in " + branches[i]);
            double finalprice = 0;
            for (int j = 0; j < flowers.length; j++) {
                double totPrice = stocks[i][j] * prices[j];
                System.out.println(flowers[j] + ": " + totPrice);
                finalprice += totPrice;
            }
            System.out.println("Store income: " + finalprice);
            System.out.println("======================");
        }
    }

    static void stockRoyal4(int[][] stocks, String[] flowers) {
        int[] reduction = {1, 2, 0, 5};
        System.out.println("======================");
        System.out.println("Final Stocks in Royal Garden 4");
        for (int i = 0; i < flowers.length; i++) {
            int finStock = stocks[3][i] - reduction[i];
            System.out.println(flowers[i] + ": " +  finStock);
        }
    }

    public static void main(String[] args) {
        System.out.println("Royal Garden Program");
        System.out.println("======================");

        int[][] stocks = {
            {10, 5, 15, 7}, 
            {6, 11, 9, 12}, 
            {2, 10, 10, 5}, 
            {5, 7, 12, 9}
        };
        double[] prices = {75000, 50000, 60000, 10000};
        String[] flowers = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        String[] branches = {"Royal Garden 1", "Royal Garden 2", "Royal Garden 3", "Royal Garden 4"};

        System.out.println("1. Display Income branch");
        System.out.println("2. Display stock on the Royal Graden 4");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                displayIncome(stocks, prices, flowers, branches);
                break;
            case 2:
                stockRoyal4(stocks, flowers);
                break;
            default:
                System.out.println("Invalid choice, Try again!");
                break;
        }

    }
}
