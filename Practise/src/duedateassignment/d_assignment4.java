package duedateassignment;

import java.util.Scanner;
import java.lang.Math;

public class d_assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String choice = "yes";
		while (choice.equals("yes")) {
			System.out.println("write number");
			int input = Integer.valueOf(sc.nextLine());

			if (input >= 1 && input <= 50) {
				System.out.println("Number : " + input);
//			System.out.println("Square Of Number : " + (int) Math.pow(input, 2));
				System.out.println("Square of Number : " + input * input);
				System.out.println("Cube Of Number : " + (int) Math.pow(input, 3));

			} else {
				System.out.println("Number must be between 1 and 50 range");
			}

			System.out.println("Do you want another (yes/no)?");
			choice = sc.nextLine();
		}

	}

}
