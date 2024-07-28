//package emp;
//
//import dept.Department;
//
//public class Freelancer extends Employee implements IBusinessTrip {
//	int time;
//	int payPerTime;
//
//	public Freelancer(int num, String name, Department department, int time, int payPerTime) {
//		super(num,name,department);
//		setTime(time);
//		setPayPerTime(payPerTime);
//	}
//
//	public int getTime() {
//		return time;
//	}
//	public void setTime(int time) {
//		this.time = time;
//	}
//	public int getPayPerTime() {
//		return payPerTime;
//	}
//	public void setPayPerTime(int payPerTime) {
//		this.payPerTime = payPerTime;
//	}
//	@Override
//	public int getPay() {
//		return getTime()*getPayPerTime();
//	}
//
//	@Override
//	public void goBusinessTrip(int day) {
//		time += (day*24);
//	}
//}
