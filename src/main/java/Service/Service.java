package Service;

import java.util.HashMap;
import java.util.Map;
import Accounts.Account;
public class Service {
	
	private static int counting = 0;
	
	private static Map<Integer, Account> map = new HashMap<Integer,Account>();
	
	protected static void addToMap(Account acc) {
		counting++;
		map.put(counting, acc);
	}
	protected static Account getAccount(int i) {
		return map.get(i);
		
	}
	
	public static Map getMap() {
		return map;
		
	}
	
}
