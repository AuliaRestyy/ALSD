import java.util.Scanner;

public class Looping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter NIM: ");
        long nim = sc.nextLong();

        System.out.println("==============================");

        int n = (int) (nim % 100);

        if (n < 10) {
            n += 10;
        }
        System.out.println("n : " + n);
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            }

            if (i % 2 == 1) {
                System.out.print("* ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
