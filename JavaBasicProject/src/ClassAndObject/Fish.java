package ClassAndObject;

public class Fish extends Animal {
	private int numberOfFins;
	
	public void swim() {
		System.out.println("Swimming");
	}

	public int getNumberOfFins() {
		return numberOfFins;
	}

	public void setNumberOfFins(int numberOfFins) {
		this.numberOfFins = numberOfFins;
	}
	
	
	
}
