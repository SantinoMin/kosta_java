package dept;
public class Department {
	int num;
	String name;
	
	public Department() {
		name="미정";
	}
	public Department(int num, String name) {
		this.num = num;
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
