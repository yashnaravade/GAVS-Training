public class PrimeUnder200 {

    public static void main(String args[]) {
        System.out.println("Prime numbers under 200 are:");
        int fact = 0, i, j, n = 200;
        for (j = 2; j <= n; j++) {
            fact = 0;
            for (i = 2; i <= j / 2; i++) {
                if (j % i == 0) {
                    fact++;
                }
            }
            if (fact == 0) {
                System.out.println(j);
            }
        }
    }

}
