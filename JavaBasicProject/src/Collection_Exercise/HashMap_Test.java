package Collection_Exercise;

import java.util.HashMap;

public class HashMap_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap <Integer,String> hm = new HashMap();
		hm.put(1,"John");
		hm.put(2,"Sonia");
		hm.put(3,"Smith");
		hm.put(4,"James");
		hm.put(5,"Kelvin");
		
		
		System.out.println("Number of Elements in HashMap: " + hm.size());
		for(Integer value:hm.keySet()) {
			System.out.println(value + "-" + hm.get(value));
		}
		hm.remove(3);
		System.out.println("After removing");
		for(Integer value:hm.keySet()) {
			System.out.println(value + "-" + hm.get(value));
		}
	}

}
