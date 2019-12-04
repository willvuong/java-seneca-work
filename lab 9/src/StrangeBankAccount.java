
public class StrangeBankAccount {
	double amount;
	String currencyType;
	
	public StrangeBankAccount(double tempAmount, String tempCurrencyType) {
		this.amount = tempAmount;
		this.currencyType = tempCurrencyType;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public String getCurrencyType() {
		return currencyType;
	}
	
	public void setAmount(double tempAmount) {
		this.amount = tempAmount;
	}
	
	public void setCurrencyType(String tempCurrencyType) {
		this.currencyType = tempCurrencyType;
	}
	
	public void withdraw(double amount) {
		this.amount = this.amount - amount;
	}
	
	public String toString() {
		return getAmount() + " " + getCurrencyType();
	}
}
