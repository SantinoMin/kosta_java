//package emp;
//
//import dept.Department;
//
//public class Sales extends Permanent implements IBusinessTrip {
//	int incentive;
//
//	public Sales(int num, String name, Department department, int pay, int incentive) {
//		super(num,name,department,pay);
//		setIncentive(incentive);
//	}
//
//	public int getIncentive() {
//		return incentive;
//	}
//
//	public void setIncentive(int incentive) {
//		this.incentive = incentive;
//	}
//
//	@Override
//	public int getPay() {
//		return super.getPay()+getIncentive();
//	}
//
//	@Override
//	public void goBusinessTrip(int day) {
//		incentive += day*100000;
//	}
//}