package chapter09;

public class Exam9_8 {
	public static double round(double d, int n) {
		double pw = Math.pow(10, n);
		return Math.round(d*pw)/pw;
	}
	
	public static void main(String[] args) {
		System.out.println(round(3.1415, 1));
		System.out.println(round(3.1415, 2));
		System.out.println(round(3.1415, 3));
		System.out.println(round(3.1415, 4));
		System.out.println(round(3.1415, 5));
	}
}

//3.1245
//3.1245 x 100d => 312.45
//Math.round(312.45) ==> 312
//312/100d  3.12