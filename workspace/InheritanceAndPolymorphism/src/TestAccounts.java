import bank.Bank;
import account.AccountUpdater;
import account.BankAccount;
import account.CurrentAccount;
import account.SavingsAccount;


public class TestAccounts {

	public static void main(String[] args) {
		
		Bank bank = new Bank();
		
		BankAccount account = new BankAccount();
		CurrentAccount currentAccount = new CurrentAccount();
		SavingsAccount savingsAccount = new SavingsAccount();
		
		account.deposit(1000);
		currentAccount.deposit(1000);
		savingsAccount.deposit(1000);
		
		bank.include(account);
		bank.include(currentAccount);
		bank.include(savingsAccount);
		
		AccountUpdater updater = new AccountUpdater(0.10);
		
		
		for(int i = 0; i < bank.getTotalAccount(); i++){
			updater.run(bank.getAccount(i));
		}
		
		System.out.println("Total Balance: " + updater.getTotalBalance());

	}

}
