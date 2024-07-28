class Person implements Cloneable {
	int age;
	String name;
	
	Person(int age, String name) {
		this.age=age;
		this.name=name;
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) return false;
		Person p = (Person)obj;
		return age==p.age && name.equals(p.name);
	}
	
	@Override
	public int hashCode() {
		return age + name.hashCode();
	}
	
	@Override
	public String toString() {
		return "이름:"+name+",나이:"+age;
	}
	
	@Override
	public Object clone() {
		try {
			return super.clone();
		} catch(CloneNotSupportedException e) {
			return null;
		}
	}
}
public class ObjectTest1 {
	public static void main(String[] args) {
		Person p1 = new Person(20,"홍길동");
		Person p2 = new Person(20,"홍길동");
		Person p3 = new Person(20,"고길동");
		Person p4 = new Person(22,"홍길동");
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));  //true
		System.out.println(p1.equals(p3));
		System.out.println(p1.equals(p4));
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
		System.out.println(p4.hashCode());
		
		System.out.println(p1.toString()); //이름:홍길동,나이:20
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		
		Person p5 = (Person)p1.clone();
		System.out.println(p5);
	}
}