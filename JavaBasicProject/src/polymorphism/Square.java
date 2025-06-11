package polymorphism;

public class Square extends Shape{
	private int side;
	public Square() {}
	public  Square(int s) {
		this.side = s;
	}
	public int getSide() {
		return side;
	}
	public void setSide(int side) {
		this.side = side;
	}
	
}
