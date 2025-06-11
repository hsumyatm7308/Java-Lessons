package Exercise;

public class Square extends Rectangle {
	private double side;
	public Square() {}
	public Square(double s) {
		this.side = s;
	}
	
	public Square(String c , boolean f,double s) {
		super.color = c;
		super.filled = f;
		this.side = s;
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	
	public String toString() {
		return "Color: " +  super.getColor() + " Filled : " + super.isFilled() + " Square Area : " + super.getArea() + " Square Perimeter : " + super.getPerimeter();
	}
	
}
