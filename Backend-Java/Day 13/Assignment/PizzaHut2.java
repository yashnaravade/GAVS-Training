class CustomerReport {
    private Customer[] custList;

    public CustomerReport(int size) {
        custList = new Customer[size];
    }

    public void addCustomer(Customer customer) {
        for (int i = 0; i < custList.length; i++) {
            if (custList[i] == null) {
                custList[i] = customer;
                break;
            }
        }
    }

    public void printList() {
        for (Customer customer : custList) {
            if (customer != null) {
                customer.display();
            }
        }
    }
}

public class PizzaHut2 {
    public static void main(String[] args) {
        CustomerReport report = new CustomerReport(5);

        for (int i = 0; i < 5; i++) {

            String custName = "Customer" + (i + 1);
            String custAddr = "Address" + (i + 1);

            Customer customer = new Customer();
            customer.setCustName(custName);
            customer.setCustAddr(custAddr);

            report.addCustomer(customer);
        }

        System.out.println("Customer Report:");
        report.printList();

        Customer.printBillNo();
    }
}
