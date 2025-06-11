package ClassAndObject;

public class PurchaseItem {
		protected String name;
		protected double unitPrice;
		
		public PurchaseItem(String n, double p){
			this.name = n;
			this.unitPrice = p;
		}
		
		public PurchaseItem(){
			this.name = "no item";
			this.unitPrice = 0;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public double getUnitPrice() {
			return unitPrice;
		}

		public void setUnitPrice(double unitPrice) {
			this.unitPrice = unitPrice;
		}
		
		public String toString() {
			return getName() + " @ " + getUnitPrice();
		}
}
