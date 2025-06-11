package variable;

import java.util.Scanner;

public class Nested_if {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String choice = "yes";
		// while (choice.equals("yes")) {
		//
		// System.out.println("Enter number");
		// int num = Integer.parseInt(sc.nextLine());
		// if (num % 2 == 0) {
		// if (num > 100) {
		// System.out.println("This number is Even and grater than 100");
		// } else if (num < 100) {
		// System.out.println("This number is Even and less than 100");
		// } else {
		// System.out.println("This number is equal to 100");
		// }
		// } else {
		// if (num > 100) {
		// System.out.println("This number is Odd and grater than 100");
		// } else if (num < 100) {
		// System.out.println("This number is Odd and less than 100");
		// } else {
		// System.out.println("This is equal to 100");
		// }
		// }
		//
		// System.out.println("Do another yes/no ?");
		// choice = sc.nextLine();
		// }

		do {

			System.out.println("Enter number");
			int num = Integer.parseInt(sc.nextLine());
			if (num % 2 == 0) {
				if (num > 100) {
					System.out.println("This number is Even and grater than 100");
				} else if (num < 100) {
					System.out.println("This number is Even and less than 100");
				} else {
					System.out.println("This number is equal to 100");
				}
			} else {
				if (num > 100) {
					System.out.println("This number is Odd and grater than 100");
				} else if (num < 100) {
					System.out.println("This number is Odd and less than 100");
				} else {
					System.out.println("This is equal to 100");
				}
			}

			System.out.println("Do another yes/no ?");
			choice = sc.nextLine();
		} while (choice.equals("yes"));

	}

}
