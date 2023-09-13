
public class Main {

	public static void main(String[] args) {
		BankAccount account = new BankAccount(1000.0);
		AtmInterface atm = new AtmInterface(account);
		atm.run();

	}

}
