class Complex {  //3+5i
	int real;
	int imaginary;
	
	Complex(int r, int i) {
		real = r;
		imaginary = i;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Complex == false) return false;
		Complex c = (Complex)obj;
		return real==c.real && imaginary==c.imaginary;
	}
	
	@Override
		public int hashCode() {
			return real*real+imaginary*imaginary*imaginary;
		}
}
public class EqualsTest1 {
	public static void main(String[] args) {
		Complex c1 = new Complex(3,5);
		Complex c2 = new Complex(3,5);
		Complex c3 = new Complex(5,3);
		Complex c4 = new Complex(3,3);
		
		System.out.println(c1.equals(c2));  //true
		System.out.println(c1.equals(c3));  //false
		System.out.println(c1.equals(c4));  //false
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());
		System.out.println(c4.hashCode());
	}

}
