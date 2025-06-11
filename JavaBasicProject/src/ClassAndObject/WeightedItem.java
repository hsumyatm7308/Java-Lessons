package ClassAndObject;

public class WeightedItem extends PurchaseItem {
	private double weight;
	
	public WeightedItem(){
		
	}
	public WeightedItem(String n, double p, double w) {
		super.name = n;
		super.unitPrice = p;
		this.weight = w;
	}
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double w) {
		this.weight = w;
	}
	
	public double  getPrice() {
		return this.weight * super.getUnitPrice();
	}
	
	public String toString() {
		return super.toString() + " " + getWeight() + " Kg" + this.getPrice() + "Kyats";
//		System.out.println(super.toString() + " " + getWeight() + " Kg" + this.getPrice() + " Kyats");
	}
}
