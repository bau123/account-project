package Service;

import Accounts.Account;

public class AddAccount {

	public static void add(String first, String last, int number) {
		Account acc = new Account();
		acc.setFirstName(first);
		acc.setLastName(last);
		acc.setAccountNumber(number);
		Service.addToMap(acc);
	}
}
