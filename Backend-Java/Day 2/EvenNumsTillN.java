public class EvenNumsTillN {
    public static void main(String args[]) {
        if (args.length == 0) {
            System.out.println("Please provide a number as a command line argument.");
            return;
        }

        int n = Integer.parseInt(args[0]); // Get the first command line argument as an integer
        int sum = 0;

        for (int i = 2; i <= n; i += 2) {
            sum += i;
        }

        System.out.println("Sum of even numbers up to " + n + ": " + sum);
    }
}
