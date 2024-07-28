package chapter04;
//숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라.
//만일 문자열이 "12345"라면, ‘1+2+3+4+5’의 결과인 15를 출력이 출력되어야 한다. 
//[Hint] String클래스의 charAt(int i)을 사용
public class Exam4_9 {

	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;
		for(int i=0; i < str.length(); i++) {
			sum += str.charAt(i)-'0';
		}
		System.out.println("sum="+sum);
	}
}
//i=0  '1'-'0'=1
//i=1  '2'-'0'=2
//i=2  '3'-'0'=3
//i=3  '4'-'0'=4
//i=4  '5'-'0'=5
