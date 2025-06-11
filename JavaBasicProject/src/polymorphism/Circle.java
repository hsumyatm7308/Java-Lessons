package polymorphism;

public class Circle  extends Shape{
	private int radius = 5;

	public Circle() {
	}

	public Circle(int r) {
		this.radius = r;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double area() {
		return 3.14 * radius * radius;
	}
	

}
