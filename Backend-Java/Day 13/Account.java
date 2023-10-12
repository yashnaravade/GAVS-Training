public class Account {
    private double balance = 5000;

    public Account(double balance) {
        this.balance = balance;
    }

    public synchronized void deposit(double amt) {
        this.balance += amt;
        System.out.println("Deposit complete");
        notifyAll();
    }

    public synchronized void withdraw(double amt) {
        System.out.println("Attempting to withdraw " + amt);
        while (balance < amt) {
            try {
                System.out.println("Waiting for sufficient balance...");
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        balance -= amt;
        System.out.println("Withdraw complete");
        // notifyAll();
    }

    public void printBalance() {
        System.out.println("Account Balance " + balance);
    }
}