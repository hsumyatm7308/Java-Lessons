package polymorphism;

public class Shape {
	public double area() {
		return 3.14*10*10;
	}
	
	public int area(int w,int l) {
		return w * l;
	}
	public double area(double b,double h) {
		return 0.5*b*h;
	}
	
	public int area(int s) {
		return s * s;
	}

}
