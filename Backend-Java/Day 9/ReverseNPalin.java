import java.util.Scanner;

public class ReverseNPalin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to reverse it and check if it is a palindrome or not: ");
        int num = sc.nextInt();
        int originalNum = num; // Store the original number before modification
        sc.close();

        int j, result = 0;

        while (num != 0) {
            j = num % 10;
            result = result * 10 + j;
            num = num / 10;
        }

        System.out.println("The reverse of the number is: " + result);

        if (originalNum == result) {
            System.out.println("The number is a palindrome");
        } else {
            System.out.println("The number is not a palindrome");
        }
    }
}
