import java.util.Scanner;

public class CalGrossSal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the basic salary of the employee: ");
        int basic = sc.nextInt();
        int gross = 0, hra = 0, da = 0;

        if (basic > 1 && basic <= 4000) {
            hra = (basic * 10) / 100;
            da = (basic * 50) / 100;
            gross = basic + hra + da;

            System.out.println("The gross salary of the employee is: " + gross);
        }

        if (basic > 4000 && basic <= 8000) {
            hra = (basic * 20) / 100;
            da = (basic * 60) / 100;
            gross = basic + hra + da;

            System.out.println("The gross salary of the employee is: " + gross);
        }

        if (basic > 8000 && basic <= 12000) {
            hra = (basic * 25) / 100;
            da = (basic * 70) / 100;
            gross = basic + hra + da;

            System.out.println("The gross salary of the employee is: " + gross);
        }

        sc.close();

    }
}
