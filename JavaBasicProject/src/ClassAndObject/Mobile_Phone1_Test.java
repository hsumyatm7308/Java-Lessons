package ClassAndObject;

public class Mobile_Phone1_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile_Phone1 mp1 = new Mobile_Phone1();
		mp1.setBrand("Vivo");
		mp1.setVersion("Android7.7");
		mp1.setMemory(8);
		System.out.println("Brand:" + mp1.getBrand());
		System.out.println("Version:" + mp1.getVersion());
		System.out.println("Memory:" + mp1.getMemory());
		mp1.dialing();
		mp1.messaging();
		mp1.play_Music();
		
		Mobile_Phone1 mp2 = new Mobile_Phone1("Apple","IOS10.1",16);
		System.out.println("Brand:" + mp2.getBrand());
		System.out.println("Version:" + mp2.getVersion());
		System.out.println("Memory:" + mp2.getMemory());
		mp2.dialing();
		mp2.messaging();
		mp2.play_Music();
	}

}
