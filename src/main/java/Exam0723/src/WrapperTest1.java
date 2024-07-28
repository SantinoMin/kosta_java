package Exam0723.src;

public class WrapperTest1 {
	public static void main(String[] args) {
		Integer n = 10;  //boxing
		Double d = 3.14; //boxing
		
		int m = n;  //unboxing
		
		//m = null; //error
		n = null;
		
		Object obj = 10;  //boxing & upcasting
		int i = (Integer)obj;
	}
}