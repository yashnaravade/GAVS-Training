import java.util.Scanner;

public class SumNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter numbers. Enter -999 to calculate the sum.");

        int number;
        while (true) {
            number = scanner.nextInt();

            if (number == -999) {
                break; // Exit the loop when -999 is encountered
            }

            sum += number;
        }

        scanner.close();

        System.out.println("Sum of the numbers entered: " + sum);
    }
}
