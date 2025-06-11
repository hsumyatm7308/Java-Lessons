package exceptionhandling;
import java.util.Scanner;

public class ArithmeticsException_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter a number");
		
		try {
			int x = Integer.parseInt(sc.nextLine());
			int y = 100 / x;
			System.out.println("y = " + y );
		}catch(ArithmeticException e) {
			System.out.println("Error divided by o"); 
			e.printStackTrace();
		}catch(NumberFormatException e1) {
			System.out.println("Please enter a valid");
		}

		

	}

}
