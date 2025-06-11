package ClassAndObject;

public class Bird extends Animal {
	private int numberOfWings;
	public void fly() {
		System.out.println("Flying");
	}
	public int getNumberOfWings() {
		return numberOfWings;
	}
	public void setNumberOfWings(int numberOfWings) {
		this.numberOfWings = numberOfWings;
	}
	
}
