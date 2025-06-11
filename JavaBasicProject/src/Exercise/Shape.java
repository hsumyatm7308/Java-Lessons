package Exercise;

public class Shape {
	protected String color = "red";
	protected boolean filled = true;
	public Shape() {}
	public Shape(String c,boolean f) {
		this.color = c;
		this.filled = f;
	}
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public String toString() {
		return "Color: " + getColor() + " Filled: " + isFilled();
	}
}
