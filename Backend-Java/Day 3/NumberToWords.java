import java.util.Scanner;

public class NumberToWords {

    private static final String[] units = {
            "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"
    };

    private static final String[] teens = {
            "", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    private static final String[] tens = {
            "", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Please enter a positive integer.");
        } else if (number == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Number in words: " + convertToWords(number));
        }

        scanner.close();
    }

    private static String convertToWords(int number) {
        if (number < 10) {
            return units[number];
        } else if (number >= 11 && number <= 19) {
            return teens[number - 10];
        } else if (number < 100) {
            return tens[number / 10] + " " + units[number % 10];
        } else if (number < 1000) {
            return units[number / 100] + " Hundred " + convertToWords(number % 100);
        } else {
            return "Number is too large to convert.";
        }
    }
}
