package polymorphism;

public class Polymorphism_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		System.out.println("Circle Area :" + c.area());
		
		
		Triangle t = new Triangle();
		System.out.println("Triangle Area : " + t.area(10.5,7.5));
		
		Rectangle r = new Rectangle();
		System.out.println("Rectangle Area : " + r.area(20,15));
		
		Square s = new Square();
		System.out.println("Square Area : " + s.area(10));

	}

}
