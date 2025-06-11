package methods;

import java.util.Scanner;

public class PrimeOrNot {

	static boolean isPrime(int n) {
//		int i;
//		for (i = 2; i < n; i++) {
//			if (n % i == 0) {
//				break;
//			}
//		}
		
		int i = 2;
		while(i < n) {
			if(n % i == 0) {
				break;
			}
			i++;
		}

		if (n == i) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice = "yes";
		while (choice.equals("yes")) {

			System.out.println("Enter a number: ");
			int num = Integer.parseInt(sc.nextLine());
			boolean result = isPrime(num);
			if (result) {
				System.out.println(num + " is prime");
			} else {
				System.out.println(num + " is not prime");
			}
			
			System.out.println("do another (yes/no)?");
			choice = sc.nextLine();

		}

	}

}
