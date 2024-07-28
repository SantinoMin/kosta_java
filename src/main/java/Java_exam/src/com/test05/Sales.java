package Java_exam.src.com.test05;

public class Sales extends Employee implements Bonus {
	public Sales() {}
	public Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}

	@Override
	public double tax() {
		return super.getSalary() * 0.13;
	}

	@Override
	public void incentive(int pay) {
		super.setSalary((int)(pay*1.2));
	}
}
