package chapter04;
//1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오.
public class Exam4_4 {
	public static void main(String[] args) {
		int sum=0, i;
		for(i=1;;i++) {
//			if(i%2==0) {
//				sum += -i;
//			} else {
//				sum += i;
//			}
			
			sum += i%2==0? -i:i;
			
			if(sum>=100) break;
		}
		System.out.println(i);
		System.out.println(sum);
	}
}
