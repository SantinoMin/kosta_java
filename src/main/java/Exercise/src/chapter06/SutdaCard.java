package chapter06;

public class SutdaCard {
	int num;
	boolean isKwang;
	
	public SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public SutdaCard() {
		num = 1;
		isKwang = true;
	}
	
	public String info() {
		return num+(isKwang? "K":"");
	}
}
