public class ExceptionTest2 {

	public static void main(String[] args) {
		int[] arr1 = new int[] {10,20,30,40};
		int[] arr2 = new int[] {5,0,6,8,2};
		
		int divSum = 0;
		for (int i = 0; i < arr2.length; i++) {
//			try {
//				divSum += arr1[i] / arr2[i];
//			} catch (ArithmeticException e) {
//				
//			} catch (ArrayIndexOutOfBoundsException e) {
//				divSum += 1;
//			}
			try {
				divSum += arr1[i] / arr2[i];
			} catch (Exception e) {
				
			}
		}
		
		System.out.println(divSum);
	}
}
