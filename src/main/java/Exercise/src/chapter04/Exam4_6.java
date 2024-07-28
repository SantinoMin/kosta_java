package chapter04;
//두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오.
public class Exam4_6 {
	public static void main(String[] args) {
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=6; j++) {
				if(i+j==6) {
					System.out.println(String.format("(%d,%d)\t", i,j));
				}
			}
		}
	}
}

//1,1 
//1,2
//1,3
//1,4
//1,5
//1,6

//2,1 
//2,2
//2,3
//2,4
//2,5
//2,6

//3,1 
//3,2
//3,3
//3,4
//3,5
//3,6
