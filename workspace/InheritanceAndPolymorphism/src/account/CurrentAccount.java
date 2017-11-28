package account;

public class CurrentAccount extends BankAccount{
	
	@Override
	public void updateBalance(double rate){
		this.balance = this.balance + this.balance*rate*2;
	}
	
	@Override
	public void deposit(double value){
		this.balance = this.balance + value - 0.10;
	}
}
