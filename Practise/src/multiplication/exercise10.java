package multiplication;

import java.util.Scanner;

public class exercise10 {

	public static void main(String[] args) {
		// Write a java program that accepts the number of array size and then inputs
		// the student names from user.
		// And then display the names in ascending order
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = Integer.parseInt(sc.nextLine());
		String name[] = new String[size];

		int i = 0;

		for (i = 0; i < size; i++) {
			System.out.println("Enter name");
			name[i] = sc.nextLine();
			System.out.println(name[i]);
		}
		
		for(i = 0; i < size - 1; i++) {
			if (name[i].charAt(0) > name[i + 1].charAt(0)) {
				String temp = name[i];
				name[i + 1] = name[i];
				name[i] = temp;

			}
			System.out.print(name[i]);

		}

	}

}
