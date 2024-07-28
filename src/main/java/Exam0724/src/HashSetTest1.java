import java.util.HashSet;

public class HashSetTest1 {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(32);
		hs.add(17);
		hs.add(84);
		hs.add(17);
	
		System.out.println(hs);
		
		HashSet<Person> hsp = new HashSet<>();
		hsp.add(new Person(20,"홍길동"));
		hsp.add(new Person(30,"김길동"));
		hsp.add(new Person(10,"하길동"));
		hsp.add(new Person(40,"허길동"));
		hsp.add(new Person(20,"홍길동"));
		
		System.out.println(hsp);
	}
}
