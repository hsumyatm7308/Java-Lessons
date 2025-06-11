package polymorphism;

public class Rectangle extends Shape {
	private int width;
	private int length;
	public Rectangle() {}
	public Rectangle(int w, int l) {
		this.length = l;
		this.width = w;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
}
