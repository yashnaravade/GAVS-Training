import java.util.Scanner;
 
class DepositThread implements Runnable{
	Account acc;
	double amt;
	DepositThread(Account acc,double amt){
		this.acc=acc;
		this.amt=amt;
	}
	public void run() {
		acc.deposit(amt);
	}
}
class WithdrawThread implements Runnable{
	Account acc;
	double amt;
	WithdrawThread(Account acc,double amt){
		this.acc=acc;
		this.amt=amt;
	}
	public void run() {
		acc.withdraw(amt);
	}
}
public class BankingDemo {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account accObj=new Account(50000);
		double amt;
		int choice;
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Check Balance");
			System.out.println("4.Exit");
			choice=sc.nextInt();
			switch(choice) {
			case 1:{
				System.out.println("Enter amount to deposit ");
				amt=sc.nextDouble();
				new Thread(new DepositThread(accObj,amt)).start();
				break;
			}
			case 2:{
				System.out.println("Enter amount to withdraw ");
				amt=sc.nextDouble();
				new Thread(new WithdrawThread(accObj,amt)).start();
				break;
			}
			case 3:{
				accObj.printBalance();
				break;
			}
			case 4:{
				System.exit(0);
			}
			}
 
		}
		
	}
 
}