import java.util.Scanner;

class SumOfNSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of inputs: ");
        int n = sc.nextInt();

        int sum = 0, i;
        int[] values = new int[n];

        for (i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }

        for (i = 0; i < n; i++) {
            sum += values[i] * values[i];
        }

        System.out.println("The sum of squares of given numbers is " + sum);
        sc.close();
    }
}