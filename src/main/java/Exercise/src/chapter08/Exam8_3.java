package chapter08;
class NumberException extends Exception {}
class InvalidNumberException extends NumberException {}
class NotANumberException extends NumberException {}

class Parent {
	void add(int a, int b) throws InvalidNumberException, NotANumberException {
	}
	
	void func() throws NumberException {
		throw new InvalidNumberException();
	}
}

class Child extends Parent {
	@Override
// O	
	void add(int a, int b) throws InvalidNumberException, NotANumberException {
	}
//	void add(int a, int b) throws InvalidNumberException {
//	}
//	void add(int a, int b) throws NotANumberException {
//	}
	
// X	
//	void add(int a, int b) throws NumberException {
//	}
//	void add(int a, int b) throws Exception {
//	}
}

public class Exam8_3 {
	public static void main(String[] args) {
		Parent p = new Parent();
		try {
			p.add(10,20);
		} catch(InvalidNumberException e) {
			
		} catch(NotANumberException e) {
			
		}
		
		try {
			p.add(10,20);
		} catch(InvalidNumberException e) {
			
		} catch(NumberException e) {
			
		}
		
		try {
			p.add(10,20);
		} catch(NotANumberException e) {
			
		} catch(NumberException e) {
			
		}
		
		try {
			p.add(10,20);
		} catch(NumberException e) {
			
		}		
		
		try {
			p.add(10,20);
		} catch(Exception e) {
			
		}		
	}
}
