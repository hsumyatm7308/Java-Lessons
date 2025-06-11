package ClassAndObject;

public class Animal {
	private double weight;
	
	public void eat() {
		System.out.println("Eating");
	}

	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

}
