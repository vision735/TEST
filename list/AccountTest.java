package list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Account> lists = new ArrayList();
		lists.add(new Account(10.00, "1234"));
		lists.add(new Account(15.00, "5678"));
		lists.add(new Account(0, "1010"));
		HashMap<Long, Account> map = new HashMap();
		for (Account ac : lists) {

			map.put(ac.getId(), ac);
		}
		Set<Long> keys = map.keySet();
		for (Long key : keys) {
			// Õ®π˝Key¿¥’“Value
			Account value = map.get(key);
			System.out.println("ID:" + key + "--”‡∂Ó: " + value.getBalance());
		}
	}

}
