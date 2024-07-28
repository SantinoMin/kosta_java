import java.io.IOException;

public class ExceptionTest8 {
	public static void func() throws IOException,ClassNotFoundException {
		int n=2;
		if(n==2) {
			throw new IOException("입출력 예외");
		} else if(n==3) {
			throw new ClassNotFoundException("클래스 캐스트 예외");
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
