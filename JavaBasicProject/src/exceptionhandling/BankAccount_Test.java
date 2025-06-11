package exceptionhandling;

public class BankAccount_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ba = new BankAccount("KBZ003233498","Khin Khin",10000);
		ba.deposit(10000);
		System.out.println(ba.toString());
		
		try {
			System.out.println(ba.toString());
			ba.withdraw(2000);
			System.out.println(ba.toString());
			
		}catch(InsufficientFundsException e) {
			e.getMessage();
			e.toString();
			e.printStackTrace();
		}

	}

}
