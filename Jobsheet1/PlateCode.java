import java.util.Scanner;
public class PlateCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] code = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        char[][] city = {
            {'B', 'A', 'N', 'T', 'E', 'N'},
            {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
            {'B', 'A', 'N', 'D', 'U', 'N', 'G'}, 
            {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
            {'B', 'O', 'G', 'O', 'R'},
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
            {'M', 'A', 'L', 'A', 'N', 'G'},
            {'T', 'E', 'G', 'A', 'L'}
        };

        System.out.print("Enter the plate code: ");
        char plateCode = sc.next().charAt(0);
        plateCode = Character.toUpperCase(plateCode);
        
        boolean found = false;
        for (int i = 0; i < code.length; i++) {
            if (plateCode == code[i]) {                
                System.out.print("City name: ");
                for (int j = 0; j < city[i].length; j++) {
                    System.out.print(city[i][j]);
                }
                System.out.println();
                found = true;
            }
        }

        if (!found) {
            System.out.println("The city name is not found, make sure you input the right plate code");
        }

        

    }
}
