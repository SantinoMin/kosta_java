package shape;

import pos.Point;

public class Ellipse extends Shape {
	Point center1;
	Point center2;
	int distanceSum;
	
	public Ellipse(String color,Point center1,Point center2, int distanceSum) {
		super(color);
		this.center1=center1;
		this.center2=center2;
		this.distanceSum = distanceSum;
	}
	
	public Ellipse(String color,int cx1,int cy1, int cx2,int cy2, int distanceSum) {
		this(color,new Point(cx1,cy1),new Point(cx2,cy2),distanceSum);

//		super(color);
//		this.center1 = new Point(cx1,cy1);
//		this.center2 = new Point(cx2,cy2);
//		this.distanceSum = distanceSum;
	}
	
	@Override
	public void draw() {
		System.out.println(String.format("[타원:색-%s,점1-%s,점2-%s,거리합-%d]", 
				color,center1.toString(),center2.toString(),distanceSum));
	}

}
