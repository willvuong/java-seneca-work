
public class Withdraw extends Thread {
	
	StrangeBankAccount account;
	
	public Withdraw(StrangeBankAccount tempStrangeBankAccount) {
		this.account = tempStrangeBankAccount;
	}
	
	@Override
	public void run() {
		synchronized(account) {
			int i = 0;
			while(i < 3) {
				if(account.getAmount() == 0) {
					try {
						System.out.println("WAITING FOR WITHDRAW");
						//System.out.println(account.toString());	
						account.wait();
					} catch (InterruptedException e) {
						System.out.println(e);
					}
				} else {
					System.out.print("Withdraw: ");
					System.out.println(account.toString());
					account.withdraw(account.getAmount());
					account.notify();
					i++;
				}
				
			}
		}
	}
}
