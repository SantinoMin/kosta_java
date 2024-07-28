public class ExceptionTest7 {
	public static void func() {
		try {
//			String str = "string";
			String str = null;
			System.out.println("스타트");
			System.out.println(str.toCharArray());
			return;
		} catch(Exception e) {
			System.out.println("예외처리");
			return;
		} finally {
			System.out.println("마무리");			
		}
	}

	public static void main(String[] args) {
		func();
	}

}
