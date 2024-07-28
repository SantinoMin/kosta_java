import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapTest1 {
	public static void main(String[] args) {
		TreeMap<String,Account> accs = new TreeMap<>();
		accs.put("1005", new Account("1005","bong",500000));
		accs.put("1003", new Account("1003","tong",300000));
		accs.put("1002", new Account("1002","song",200000));
		accs.put("1004", new Account("1004","gong",400000));
		accs.put("1001", new Account("1001","hong",100000));
		
		System.out.println(accs);
		Account acc = accs.get(accs.firstKey());
		System.out.println(acc);
		Account acc2 = accs.get(accs.lastKey());
		System.out.println(acc2);
		
		SortedMap<String, Account> sm = accs.tailMap("1004");
		System.out.println(sm.values());
	}
}