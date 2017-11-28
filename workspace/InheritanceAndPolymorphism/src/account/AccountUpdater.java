package account;

public class AccountUpdater {

	private double totalBalance;
	private double selic;
	
	public AccountUpdater(double selic){
		this.selic = selic;
		this.totalBalance = 0;
	}

	public double getTotalBalance() {
		return totalBalance;
	}

	public void run(BankAccount account){
		System.out.println("Old Balance: " + account.getBalance());
		account.balance = account.balance + account.balance*this.selic;
		System.out.println("New Balance:" + account.getBalance());
		
		this.totalBalance = this.totalBalance + account.getBalance();
	}
}
