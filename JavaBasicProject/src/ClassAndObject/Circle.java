package ClassAndObject;

public class Circle implements Shape{
	private double radius;
	public Circle() {}
	public Circle(double r) {
		this.radius = r;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return 3.14 * radius * radius;
	}
}
