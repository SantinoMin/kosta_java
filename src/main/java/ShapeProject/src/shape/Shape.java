package shape;
abstract public class Shape {
	String color;
	
	public Shape() {
		color = "흰색";
	}
	public Shape(String color) {
		this.color = color;
	}
	
	abstract public void draw();
}
