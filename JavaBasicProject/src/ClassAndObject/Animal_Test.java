package ClassAndObject;

public class Animal_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird b = new Bird();
		b.setWeight(5.5);
		b.setNumberOfWings(2);
		System.out.println("Weight:" + b.getWeight());
		System.out.println("Number of wings:" + b.getNumberOfWings());
		b.eat();
		b.fly();
		
		Fish f = new Fish();
		f.setWeight(10.3);
		f.setNumberOfFins(6);
		System.out.println("Weight:" + f.getWeight());
		System.out.println("Number of fins:" + f.getNumberOfFins());
		f.eat();
		f.swim();
		
	}

}
