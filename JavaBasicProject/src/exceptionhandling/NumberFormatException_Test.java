package exceptionhandling;

import java.util.Scanner;

public class NumberFormatException_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");


		try {
			int num = Integer.parseInt(sc.nextLine());
			System.out.println("Number is " + num);
		} catch (NumberFormatException e) {
			System.out.println("Please enter a valid numeric value!");
		}
	}

}
