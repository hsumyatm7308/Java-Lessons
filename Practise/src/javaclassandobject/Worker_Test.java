package javaclassandobject;

public class Worker_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker wk = new Worker();
		wk.setName("Aye Aye");
		wk.setAge(25);
		wk.setGender("female");
		wk.setSalary(300000);
		
	
		
		System.out.println(wk.toString());
		
		Worker wk2 = new Worker();
		wk2.setName("Kyaw Aye");
		wk2.setAge(35);
		wk2.setGender("male");
		wk2.setSalary(1000000);
		
		System.out.println(wk2.toString());
	}

}
