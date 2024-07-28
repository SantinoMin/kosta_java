package shape;
import pos.Point;

public class Rectangle extends Shape {
	Point startPos;
	int width;
	int height;
	
	public Rectangle() {}
	public Rectangle(String color, Point startPos, int width, int height) {
		super(color);
		this.startPos=startPos;
		this.width=width;
		this.height=height;
	}
	
	public Rectangle(String color, int sx, int sy, int width, int height) {
		this(color, new Point(sx,sy),width,height);
	}
	
	public void draw() {
		System.out.println(String.format("[사각형:색-%s,시작점-%s,가로-%d,세로-%d]", 
				color,startPos.toString(),width,height));
	}
}
