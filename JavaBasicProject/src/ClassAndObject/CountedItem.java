package ClassAndObject;

public class CountedItem extends PurchaseItem {
	private int quantity;

	public CountedItem() {

	}

	public CountedItem(String n, double p, int q) {
		super.name = n;
		super.unitPrice = p;
		this.quantity = q;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int q) {
		this.quantity = q;
	}

	public double getPrice() {
		return quantity * super.getUnitPrice();
	}
	
	public String toString() {
		return super.toString() + " " + getQuantity() + " units" + this.getPrice() + "Kyats";
	}
}
