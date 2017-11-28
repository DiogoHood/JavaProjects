package bank;

import java.util.ArrayList;

import account.BankAccount;

public class Bank {
	
	ArrayList<BankAccount> accountList = new ArrayList<BankAccount>();
	
	public void include(BankAccount account){
		accountList.add(account);
	}
	
	public BankAccount getAccount(int i){
		return this.accountList.get(i);
	}
	
	public int getTotalAccount(){
		return this.accountList.size();
	}
}
