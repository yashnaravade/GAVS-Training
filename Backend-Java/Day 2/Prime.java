import java.util.Scanner;

public class Prime {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to find if its prime or not:");
        int fact = 0, i, n = sc.nextInt();

        if (n == 1) {
            System.out.println("One is not a prime number");
        } else {
            for (i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    fact++;
                }
            }
            if (fact != 0) {
                System.out.println("It's not a prime number");
            } else {
                System.out.println("It's a prime number!");
            }
        }

    }

}
