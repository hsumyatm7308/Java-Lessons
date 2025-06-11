package Collection_Exercise;

public class Product {
	private int pid;
	private String name;
	private double price;
	
	public Product() {}
	public Product(int id,String n,double p) {
		this.pid = id;
		this.name = n;
		this.price = p;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		return "ID: " + getPid() + " Name: " + getName() + " Price: " + getPrice();
	}
	
}
