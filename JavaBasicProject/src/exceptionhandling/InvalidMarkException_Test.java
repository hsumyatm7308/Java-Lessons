package exceptionhandling;

import java.util.Scanner;

public class InvalidMarkException_Test {

	public static void main(String[] args) throws InvalidMarkException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter mark");
		int mark = Integer.parseInt(sc.nextLine());
		if (mark < 0 || mark > 100) {
			throw new InvalidMarkException();
		} else if (mark > 50) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}

}
