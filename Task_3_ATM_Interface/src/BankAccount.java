public class BankAccount {
	private double balance;
	int pin;
	
	public BankAccount(double openingBalance) {
		balance = openingBalance;
	
	}

	public double getBalance() {
		return balance;
	}
 
	public void deposit(double amount) {
		if(amount >0) {
			balance += amount;
			System.out.println("The Amount  $" + amount + " Deposited Succesfully. ");
		}else {
			System.out.println("Please Enter Valid deposit amount.");
		}
	}

	public boolean Withdraw(double amount) {
		if(amount>0 && balance>= amount) {
			balance -= amount;
			System.out.println("The Amount  $" + amount + " Withdrawn Successfully.");
			return true;
		}else {
			System.out.println("Insufficient balance.");
			return false;
		}
		
	}
	
}
