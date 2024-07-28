package chapter04;

public class Exam4_1 {

	public static void main(String[] args) {
//		1. int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
		int x=15;
		System.out.println(x>10 && x<20);
		
//		2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
		char ch2 = ' ';
		System.out.println(ch2==' ' || ch2=='\t');
		
//		3. char형 변수 ch가 ‘x' 또는 ’X'일 때 true인 조건식
		char ch3 = 'x';
		System.out.println(ch3=='x' || ch3=='X');
		
//		4. char형 변수 ch가 숫자(‘0’~‘9’)일 때 true인 조건식
		char ch4 = '5';
		System.out.println(ch4>='0' && ch4<='9');
		
//		5. char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
		char ch5 = 't';
		System.out.println(ch5>='A'&&ch5<='Z' || ch5>='a'&&ch5<='z');
		
//		6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지 않을 때 true인 조건식
		int year=2024;
		System.out.println(year%400==0 || year%4==0&&year%100!=0);
		
//		7. boolean형 변수 powerOn가 false일 때 true인 조건식
		boolean powerOn = false;
		System.out.println(!powerOn);
		
//		8. 문자열 참조변수 str이 “yes”일 때 true인 조건식
		String str = "yes";
		System.out.println(str.equals("yes")); //** 중요
	}
}
