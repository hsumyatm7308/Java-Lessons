package multiplication;

import java.util.Scanner;

public class exercise9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice = "yes";

		do {
			System.out.println("Enter book order number");

			int qty_of_textbook = Integer.parseInt(sc.nextLine());
			float per_price = 0;

			if (qty_of_textbook >= 0) {
				if (qty_of_textbook >= 1 && qty_of_textbook <= 5) {
					per_price = 20.00f;
				} else if (qty_of_textbook <= 9) {
					per_price = 15.00f;
				} else {
					per_price = 12.00f;
				}
				System.out.println("Total price = " + (per_price * qty_of_textbook));
			} else {
				System.out.println("Invalid input");
			}
			System.out.println("Do another (yes/no)?");
			choice = sc.nextLine();

		} while (choice.equals("yes"));

	}

}
