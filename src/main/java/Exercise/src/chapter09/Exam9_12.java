package chapter09;

public class Exam9_12 {
	public static int getRand(int from, int to) {
		int min = Math.min(from, to); //-3
		int max = Math.max(from, to); //1
		
//		0*(1+3+1)-3<= (int)(Math.random()*(1+3+1))-3 < 1*(1+3+1)-3
//		-3 <= (int)(Math.random()*(1+3+1))-3 < 2
		
		return (int)(Math.random()*(max-min+1))+min;
	}
	public static void main(String[] args) {
		for (int i = 0; i < 20; i++)
			System.out.print(getRand(1, -3) + ",");
	}
}