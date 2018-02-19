package app;

import Accounts.Account;
import Service.AddAccount;
import Service.JSON;
import Service.RetrieveAccount;

public class Start {
	
	public static void main(String p []) {
		Account bau = new Account("Bau", "Nguyen", 65);
		Account dude = new Account("dude", "Nguyen", 65);

		AddAccount.add(bau);
		
		
		Account acc = RetrieveAccount.retrieve(1);
		
		String fName = acc.getFirstName();
		String lName = acc.getLastName();
		int accNumber = acc.getAccountNumber();
		
		JSON.createJsonObject();
		
	}
	
}
