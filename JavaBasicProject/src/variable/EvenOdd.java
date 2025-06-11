package variable;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String choice = "yes";
		
//		for (int count = 1; count <= 3; count++) {
		
		while(choice.equals("yes")) {

			System.out.println("enter a number");

			String value = sc.nextLine();
			int num = Integer.parseInt(value);
			if (num % 2 == 0) {
				System.out.println(num + " is Even");
			} else {
				System.out.println(num + " is Odd");
			}
			
			System.out.println("Do another(yes/no)?");
			choice = sc.nextLine();

		}
	}

}
