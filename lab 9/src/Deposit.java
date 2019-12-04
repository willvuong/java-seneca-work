
public class Deposit extends Thread {
	
	StrangeBankAccount account;
	double[] amount;
	String[] currency;
	
	public Deposit(StrangeBankAccount tempStrangeBankAccount, double[] tempAmount, String[] tempCurrency) {
		this.account = tempStrangeBankAccount;
		this.amount = tempAmount;
		this.currency = tempCurrency;
	}
	
	@Override
	public void run() {
		synchronized (account) {
			int i = 0;
			while(i < 3) {
				if(account.getAmount() == 0) {
					account.setAmount(amount[i]);
					account.setCurrencyType(currency[i]);
					System.out.print("Deposited: ");
					System.out.println(account.toString());
					account.notify();
					i++;
				} else {
					try {
						System.out.println("WAITING FOR DEPOSIT");
						account.wait();
					} catch (InterruptedException e) {
						System.out.println(e);
					}
				}	
			}	
		}
	}
	
}
