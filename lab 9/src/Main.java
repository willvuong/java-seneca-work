
public class Main {

	public static void main(String[] args) {
		StrangeBankAccount account = new StrangeBankAccount(0, "");
		double[] balance = {1.0, 2.0, 3.0};
		String[] currency = {"CAD", "EUR", "GBD"};
		
		Thread deposit = new Thread(new Deposit(account, balance, currency));
		Thread withdraw = new Thread(new Withdraw(account));
		
		deposit.start();
		withdraw.start();
		 
	}

}
