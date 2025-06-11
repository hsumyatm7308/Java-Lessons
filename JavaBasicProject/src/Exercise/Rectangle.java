package Exercise;

public class Rectangle extends Shape {
	protected double width;
	protected double length;

	public Rectangle() {
	}

	public Rectangle(double w, double l) {
		this.width = w;
		this.length = l;
	}

	public Rectangle(String c, boolean f, double w, double l) {
		super.color = c;
		super.filled = f;
		this.length = l;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getArea() {
		return width * length;
	}

	public double getPerimeter() {
		return 2 * (width + length);
	}

	public String toString() {
		return super.toString() + "Rectangle Area: " + getArea() + " Rectangle Perimeter : " + getPerimeter();
	}

}
