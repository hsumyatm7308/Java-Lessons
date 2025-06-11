package Exercise;

public class Circle extends Shape{
	private double radius = 1.0;
	public double Circle(double r) {
		return radius = r;
	}
	
	public Circle(String c,boolean f,double r) {
		super.color = c;
		super.filled = f;
		this.radius = r;
		
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public double getPerimeter() {
		return 2*3.14*radius;
	}
	
	public String toString() {
		return super.toString() +" Circle Area: " + getArea() + " Circle Perimeter: " + getPerimeter();
	}
}
