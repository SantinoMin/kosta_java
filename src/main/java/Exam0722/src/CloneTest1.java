class Point implements Cloneable {
	int x;
	int y;
	
	Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	@Override
	public String toString() {
		return "("+x+","+y+")";
	}
	
	@Override
	public Object clone() {
		try {
			return super.clone();
		} catch(CloneNotSupportedException e) {
			return null;
		}
	}
}

public class CloneTest1 {

	public static void main(String[] args) {
		Point p1 = new Point(3,5);
		//Point p2 = p1;
		Point p2 = (Point)(p1.clone());
		p1.x=100;
		System.out.println(p1);
		System.out.println(p2);
	}
}
