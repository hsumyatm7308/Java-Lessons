package duedateassignment2;

import java.util.Scanner;

public class d_assignment04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {

			System.out.println("Enter name");
			String search_name = sc.nextLine();
			String names[] = { "Aung", "Maung", "S" };
			int i = 0;
			boolean flag = false;

			for (i = 0; i < names.length; i++) {
				if (names[i].equalsIgnoreCase(search_name)) {
					flag = true;
					break;
				}

			}

			if (flag == true) {
				System.out.println("found");
			} else {
				System.out.println("Not Found");
			}

			System.out.println("Do another (y/n)");
			choice = sc.nextLine();
		}

	}

}
