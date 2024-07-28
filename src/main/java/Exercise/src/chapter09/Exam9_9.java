package chapter09;

public class Exam9_9 {
	
	public static String delChar(String src, String delStr) {
		StringBuilder sb = new StringBuilder(src);
		for(int i=0; i<delStr.length(); i++) {
			while(true) {
				int idx = sb.indexOf(delStr.charAt(i)+"");
				if(idx<0) break;
				sb.deleteCharAt(idx);
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println("(1!2@3^4~5)" + " -> " + delChar("(1!~2@3^4~5)", "~!@#$%^&*()"));
		System.out.println("(1 2 3 4\t5)" + " -> " + delChar("(1 2 3 4\t5)", " \t"));
	}

}
//(1!2@3^4~5) -> 12345
//(1 2 3 4 5) -> (12345)