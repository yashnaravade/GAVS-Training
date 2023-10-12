import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class Customer {
    private int custNo;
    private String custName;
    private String custAddr;
    private static int billNoCounter;

    static {
        billNoCounter = 0; // static block. Anything inside this block will be executed only once. It is
                           // used to initialize static variables.
    }

    public Customer() {
        custNo = ++billNoCounter;
        custName = "Yash";
        custAddr = "";
    }

    public Customer(int custNo, String custName, String custAddr) {
        this.custNo = custNo;
        this.custName = custName;
        this.custAddr = custAddr;
    }

    public void display() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String currentDate = sdf.format(new Date());

        System.out.println("Bill No: " + custNo + "\t\tDate: " + currentDate);
        System.out.println("Customer: " + custName);
        System.out.println("Address  : " + custAddr);
        System.out.println();
    }

    public static void printBillNo() {
        System.out.println("Current Bill No: " + billNoCounter);
    }

    public void setCustNo(int custNo) {
        this.custNo = custNo;
    }

    public int getCustNo() {
        return custNo;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustAddr(String custAddr) {
        this.custAddr = custAddr;
    }

    public String getCustAddr() {
        return custAddr;
    }
}

class Pizza {
    protected String type;
    protected String[] toppings;
    protected String name;
    protected float timeForPreparation;

    public Pizza(String type, String[] toppings, String name, float timeForPreparation) {
        if (type.equalsIgnoreCase("veg") || type.equalsIgnoreCase("non-veg")) {
            this.type = type;
            this.toppings = toppings;
            this.name = name;
            this.timeForPreparation = timeForPreparation;
        } else {
            System.out.println("Invalid type");
        }
    }

    public String toString() {
        return "Pizza details are: " + type + " " + name + " with " + String.join(", ", toppings) +
                " toppings which takes " + timeForPreparation + " min for preparation.";
    }
}

class ItalianPizza extends Pizza {
    public ItalianPizza(String type, String[] toppings, String name, float timeForPreparation) {
        super(type, toppings, name, timeForPreparation);
    }

    @Override
    public String toString() {
        return "Italian Pizza details are: " + type + " " + name + " with " + String.join(", ", toppings) +
                " toppings which takes " + timeForPreparation + " min for preparation.";
    }
}

class MexicanPizza extends Pizza {
    public MexicanPizza(String type, String[] toppings, String name, float timeForPreparation) {
        super(type, toppings, name, timeForPreparation);
    }

    @Override
    public String toString() {
        return "Mexican Pizza details are: " + type + " " + name + " with " + String.join(", ", toppings) +
                " toppings which takes " + timeForPreparation + " min for preparation.";
    }
}

public class PizzaHut1 {
    public static void main(String[] args) {
        Customer customer = new Customer();

        customer.setCustNo(1);
        customer.setCustName("John");
        customer.setCustAddr("123 Main Street");

        System.out.println("Customer Details:");
        customer.display();
        Scanner scanner = new Scanner(System.in);
        boolean continueOrdering = true;

        while (continueOrdering) {
            System.out.println("Choose an option: ");
            System.out.println("1. Italian Pizza");
            System.out.println("2. Mexican Pizza");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Enter pizza type (veg/non-veg): ");
                String type = scanner.next();
                System.out.println("Enter pizza name: ");
                String name = scanner.next();
                System.out.println("Enter toppings (comma-separated): ");
                String toppingsStr = scanner.next();
                String[] toppings = toppingsStr.split(",");
                System.out.println("Enter time for preparation (in minutes): ");
                float timeForPreparation = scanner.nextFloat();

                ItalianPizza italianPizza = new ItalianPizza(type, toppings, name, timeForPreparation);
                System.out.println(italianPizza);
            } else if (choice == 2) {
                System.out.println("Enter pizza type (veg/non-veg): ");
                String type = scanner.next();
                System.out.println("Enter pizza name: ");
                String name = scanner.next();
                System.out.println("Enter toppings (comma-separated): ");
                String toppingsStr = scanner.next();
                String[] toppings = toppingsStr.split(",");
                System.out.println("Enter time for preparation (in minutes): ");
                float timeForPreparation = scanner.nextFloat();

                MexicanPizza mexicanPizza = new MexicanPizza(type, toppings, name, timeForPreparation);
                System.out.println(mexicanPizza);
            } else if (choice == 3) {
                continueOrdering = false;
            }
        }
        scanner.close();
    }
}
