package Exam0724.src;

class Person implements Cloneable, Comparable<Person> {
	int age;
	String name;
	

	@Override
	public int compareTo(Person o) {
		return age-o.age;
	}
	
	Person(int age, String name) {
		this.age=age;
		this.name=name;
	}

	@Override
	public String toString() {
		return "이름:"+name+",나이:"+age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person == false) return false;
		Person p = (Person)obj;
		return age==p.age && name.equals(p.name);
	}
	
	@Override
	public int hashCode() {
		return age+name.hashCode();
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