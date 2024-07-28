import java.util.ArrayList;
import java.util.Iterator;

import emp.Employee;
import emp.IBusinessTrip;

public class Company {
	ArrayList<Employee> emps = new ArrayList<>();
	
	public void addEmployee(Employee emp) {
		emps.add(emp);
	}
	
	public void allEmployeeInfo() {
		for(Employee emp : emps) {
			System.out.println(emp.info());
		}
	}
	
	public int getTotalPay() {
		int tot=0;
		
		Iterator<Employee> it = emps.iterator();
		while(it.hasNext()) {
			tot+=it.next().getPay();
		}
		return tot;
	}
	
	public Employee findEmpByNum(int empNum) {
		for(Employee emp : emps) {
			if(emp.getNum()==empNum) {
				return emp;
			}
		}
		return null;
	}
	
	public void regDepartment(int empNum,int deptNum, String deptName) {
		Employee emp = findEmpByNum(empNum);
		if(emp==null) {
			System.out.println("없는 사번입니다.");
			return;
		}
		emp.getDepartment().setNum(deptNum);
		emp.getDepartment().setName(deptName);
	}	
	
	public void regBusinessTrip(IBusinessTrip emp, int day) {
		emp.goBusinessTrip(day);
	}
}
