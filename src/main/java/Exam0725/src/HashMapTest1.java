import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Account {
	String id;
	String name;
	Integer balance;
	public Account(String id, String name, Integer balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getBalance() {
		return balance;
	}
	public void setBalance(Integer balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
}
public class HashMapTest1 {
	public static void main(String[] args) {
		HashMap<String,Account> hs = new HashMap<>();
		
		hs.put("1001", new Account("1001","hong",100000));
		hs.put("1002", new Account("1002","song",200000));
		hs.put("1003", new Account("1003","tong",300000));
		hs.put("1004", new Account("1004","gong",400000));
		hs.put("1005", new Account("1005","bong",500000));
		
		Account acc = hs.get("1003");
		System.out.println(acc);
		
		
		if(hs.containsKey("1006")==false) {
			hs.put("1006", new Account("1006","wong",600000));
		}
		System.out.println(hs);
		hs.remove("1006");
		System.out.println(hs);
		
		Set<String> ks = hs.keySet();
		System.out.println(ks);
		
		Collection<Account> vs= hs.values();
		System.out.println(vs);
		
		for(Account ac: hs.values()) {
			System.out.println(ac);
		}
		
		System.out.println("===========");
		for(String key: hs.keySet()) {
			System.out.println(hs.get(key));
		}
		
		System.out.println("===========");
		for(Map.Entry<String, Account> entry : hs.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}
}
