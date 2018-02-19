package Service;

import Accounts.Account;

public class RetrieveAccount {

	public static Account retrieve(int i) {
		Account account = Service.getAccount(i);
		
		return account;
		
	}
}
