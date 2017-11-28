package account;

public class BankAccount {

	protected double balance;
	
	public void deposit(double value){
		this.balance = this.balance + value;
	}
	
	public void cashOut(double value){
		this.balance = this.balance - value;
	}

	public double getBalance() {
		return balance;
	}
	
	public void updateBalance(double rate){
		this.balance = this.balance + this.balance*rate;
	}
}
