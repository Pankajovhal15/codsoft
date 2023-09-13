import java.util.Scanner;

public class AtmInterface {
		
	private BankAccount account;

	public AtmInterface(BankAccount account) {
		this.account = account;
	}
	public void displayOptions() {
		System.out.println("Welcome To the ATM");
		System.out.println("---------------------");
		
		System.out.println("1.Check Balance");
		System.out.println("2.Deposit");
		System.out.println("3.Withdraw");
		System.out.println("4.Exit");
		System.out.println("---------------------");
	}
		public void run() {
			Scanner sn = new Scanner(System.in);
			int choice;
			double amount;
			while (true) {
				displayOptions();
				System.out.println("Enter Your Choice:");
				choice = sn.nextInt();
				
				switch (choice) {
				case 1:
					System.out.println("-------------");
					System.out.println("Current Balance:  $" + account.getBalance());
					System.out.println("-------------");
					
					break;
				case 2:
					System.out.println("Enter deposite Amount:  $");
					amount = sn.nextDouble();
					account.deposit(amount);
					break;
				case 3:
					System.out.println("Enter your PIN:");
					int pin = sn.nextInt();
					
					
					
					if(pin==1234) {
						System.out.println("Enter Withdrawal ammount:  $");
						amount = sn.nextDouble();
					if(account.Withdraw(amount)) {
						//System.out.println("Withdrawal Successfull");
						System.out.println("Please Take Your cash.");
						System.out.println("-------------");
						System.out.println("Remaining balance $:" + account.getBalance());
						System.out.println("-------------");
					}
					}else {
						System.out.println("Incorrect PIN. Please Try Again..!");
					}
					break;
					
				case 4:
					System.out.println("Thank You For Using ATM. GoodBye..!");
					sn.close();
					return;
					
				default:
					System.out.println("invalid choice. Please Try Again");
					
				}
				
			}
			
		}
}
