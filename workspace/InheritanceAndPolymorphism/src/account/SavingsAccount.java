package account;


public class SavingsAccount extends BankAccount{
	
	@Override
	public void updateBalance(double rate){
		this.balance = this.balance + this.balance*rate*3;
	}

}
