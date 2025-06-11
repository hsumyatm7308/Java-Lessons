package polymorphism;

public class Triangle extends Shape{
	private double base;
	private double height;
	public Triangle() {}
	public Triangle(double b,double h) {
		this.base = b;
		this.height = h;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	
}
