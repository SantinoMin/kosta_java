package chapter04;
//구구단의 일부분을 다음과 같이 출력하시오.
public class Exam4_12 {

	public static void main(String[] args) {
		for(int sdan=2 ; sdan<9; sdan+=3) {
			for(int idx=1; idx<=3; idx++) {
				for(int dan=sdan; dan<=(sdan+2<10?sdan+2:sdan+1); dan++) {
					System.out.print(String.format("%d*%d=%d\t", dan,idx,dan*idx));
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
//[실행결과]
//2*1=2   3*1=3   4*1=4
//2*2=4   3*2=6   4*2=8
//2*3=6   3*3=9   4*3=12

//5*1=5   6*1=6   7*1=7
//5*2=10  6*2=12  7*2=14
//5*3=15  6*3=18  7*3=21

//8*1=8   9*1=9
//8*2=16  9*2=18
//8*3=24  9*3=27