import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet<Person> ts = new TreeSet<>();
		
		ts.add(new Person(20,"홍길동"));
		ts.add(new Person(10,"김길동"));
		ts.add(new Person(50,"차길동"));
		ts.add(new Person(40,"장길동"));
		ts.add(new Person(30,"하길동"));
		
		System.out.println(ts);
		
		TreeSet<Person> ts2 = new TreeSet<>(new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.name.compareTo(o2.name);
			}
		});

		ts2.add(new Person(20,"홍길동"));
		ts2.add(new Person(10,"김길동"));
		ts2.add(new Person(50,"차길동"));
		ts2.add(new Person(40,"장길동"));
		ts2.add(new Person(30,"하길동"));
		
		System.out.println(ts2);

		TreeSet<Employee> ets = new TreeSet<>(new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getPay()-o2.getPay();
			}
			
		});
		ets.add(new Employee("강길동",1000000));
		ets.add(new Employee("송길동",2000000));
		ets.add(new Employee("강길동",1000000));
		ets.add(new Employee("고길동",500000));
		
		System.out.println(ets);
	}
}
