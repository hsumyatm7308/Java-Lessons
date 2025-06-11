package ClassAndObject;

public class Mobile_Phone_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile_Phone mp = new Mobile_Phone();
		mp.brand = "Samsung";
		mp.version = "Andriod 8.5";
		mp.memory = 16;
		System.out.println("Brand:"+mp.brand);
		System.out.println("Version:" + mp.version);
		System.out.println("Memory:" + mp.memory);
		
		mp.dialing();
		mp.messaging();
		mp.play_Music();
	}

}
