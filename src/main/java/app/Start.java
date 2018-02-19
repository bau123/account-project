package app;

import Accounts.Account;
import Service.AddAccount;
import Service.RetrieveAccount;

public class Start {
	
	public static void main(String p []) {
		int accountNumber = 1;
		AddAccount.add("Bau", "Nguyen", 12345);
		
		
		Account acc = RetrieveAccount.retrieve(accountNumber);
		
		String fName = acc.getFirstName();
		String lName = acc.getLastName();
		int accNumber = acc.getAccountNumber();
		System.out.println(fName + " " + lName + " " + accNumber);
		
		
	}
}
