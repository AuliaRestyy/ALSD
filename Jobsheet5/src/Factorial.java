public class Factorial {
    int factorialBF(int n){
        int facto = 1;
        int i = 1;
        while (i <= n) {
            facto = facto * i;
            i++;
        }
        return facto;
        // for (int i = 1; i <= n; i++) {
        //     facto = facto * i;
        // }
        //return facto;
    }

    int factorialDC(int n){
        if (n == 1) {
            return 1;
        } else {
            int facto = n * factorialDC(n - 1);
            return facto;
        }
    }
}
