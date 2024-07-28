package BankProject.src.acc;


import BankProject.src.exc.BankErr;
import BankProject.src.exc.BankException;

public class Account {
	String num;
	String name;
	int balance;
	
	public Account(){}
	public Account(String num, String name, int money) {
		this.num = num;
		this.name = name;
		this.balance = money;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return String.format("계좌번호:%s, 이름:%s, 잔액:%d", num,name,balance);	
	}
	
	public void deposit(int money) throws BankException {
		if(money<=0) throw new BankException("입금오류", BankErr.DEPOSIT);
		balance += money;
	}
	
	public void withdraw(int money) throws BankException {
		if(money<=0) throw new BankException("출금오류",BankErr.WITHDRAW);
		if(money>balance) throw new BankException("출금오류",BankErr.NOTBALANCE);
		balance -= money;
	}
}
