package emp;
import dept.Department;

abstract public class Employee {
	int num;
	String name;
	Department department;
	
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
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
//	public int getPay() {
//		return pay;
//	}
//	public void setPay(int pay) {
//		this.pay = pay;
//	}
	public Employee() {}
	public Employee(int num, String name, Department department) {
		this.num=num;
		this.name=name;
		this.department=department;
	}
	public Employee(int num, String name, int departmentNum, String departmentName) {
//		this.num=num;
//		this.name=name;
//		this.department=new Department(departmentNum, departmentName);
		this(num,name,new Department(departmentNum, departmentName));
	}
	
	public Employee(int num, String name) {
		this(num,name,new Department());
	}
	
	public String info() {
		return String.format("사번:%d,이름:%s,부서:%s,급여:%d", 
				num,name,department.getName(), getPay());
	}
	
	abstract public int getPay();
}
