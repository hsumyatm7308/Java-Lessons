package exceptionhandling;

import java.util.Scanner;

public class DivisonByZeroException_Test {

	public static void main(String[] args) throws DivisonByZeroException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter divisor value:");
		try {
		int div = Integer.parseInt(sc.nextLine());
		int result = 100 / div;
		System.out.println("Result=" + result);
		}catch(ArithmeticException e) {
			throw new DivisonByZeroException("Divisor must not be zero");
		}
	}

}
