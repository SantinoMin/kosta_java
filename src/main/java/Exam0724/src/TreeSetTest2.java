import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest2 {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(34);
		ts.add(67);
		ts.add(25);
		ts.add(12);
		ts.add(7);
		ts.add(77);
		ts.add(70);
		
		System.out.println(ts);
		
		SortedSet<Integer>  ss = ts.subSet(70, 80);
		System.out.println(ss);
	}

}
