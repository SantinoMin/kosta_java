package chapter04;
//int타입의 변수 num 이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라. 
//만일 변수 num의 값이 12345라면, ‘1+2+3+4+5’의 결과인 15를 출력하라. 
//[주의] 문자열로 변환하지 말고 숫자로만 처리해야 한다.
public class Exam4_10 {
	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		for(;num!=0;) {
			sum += num%10;
			num /= 10;
		}
		System.out.println(sum);
	}
}
//num=12345
//12345%10  r:5, num=12345/10 
//1234%10   r:4, num=1234/10
//123%10    r:3, num=123/10
//12%10     r:2, num=12/10
//1%10      r:1, num=1/10
//0
