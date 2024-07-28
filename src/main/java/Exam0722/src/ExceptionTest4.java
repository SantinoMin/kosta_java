public class ExceptionTest4 {
	public static void main(String[] args) {
		try {
			String str = null;
			System.out.println(str.toString());
		} catch(NullPointerException e) {
			try {
				throw e;
			} catch(Exception ee) {
				ee.printStackTrace();
			}
		}

	}

}
