public class ExceptionTest3 {

	public static void main(String[] args) {
		try {
			System.out.println(1);
			throw new Exception("내가 만든 예외");
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("종료");
	}
}
