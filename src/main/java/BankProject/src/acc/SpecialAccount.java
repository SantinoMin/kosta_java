package BankProject.src.acc;


import BankProject.src.exc.BankException;

public class SpecialAccount extends Account {
	String grade;

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		switch(grade.charAt(0)) {
		case 'V':
		case 'v': this.grade="VIP"; break;
		case 'G':
		case 'g': this.grade="Gold"; break;
		case 'S':
		case 's': this.grade="Silver"; break;
		default : this.grade="Normal"; break;
		}
	}
	
	public SpecialAccount(String num, String name, int money, String grade) {
		super(num,name,money);
		setGrade(grade);
	}
	
	@Override
	public void deposit(int money) throws BankException {
		switch(grade) {
		case "VIP": money*=1.04; break;
		case "Gold": money*=1.03; break;
		case "Silver": money*=1.02; break;
		case "Normal": money*=1.01; break;
		}
		super.deposit(money);
	}
	
	@Override
	public String toString() {
		return super.toString()+", 등급:"+getGrade();
	}
}
