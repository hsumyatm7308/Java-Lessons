package ClassAndObject;

public class Mobile_Phone1 {
	private String brand;
	private String version;
	private int memory;
	
	//default constructor (or) no argument constructur
	public Mobile_Phone1(){}
	
	//3 argument Constructor 
	public Mobile_Phone1(String b, String v, int m){
		this.brand = b;
		this.version = v;
		this.memory = m;
	}
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	
	public int getMemory() {
		return memory;
	}
	
	public void setMemory(int memory) {
		this.memory = memory;
	}
	
	public void dialing() {
		System.out.println("Ringing");
	}
	
	public void messaging() {
		System.out.println("Ti");
	}
	public void play_Music() {
		System.out.println("Song");
	}
	

}
