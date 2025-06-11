package array;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// Write a program that accepts the search name from user and results that name
		// is found or not.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String search_name = sc.nextLine();
		String names[] = { "Aung", "Maung", "S" };
		int i = 0;
		boolean flag = false;

		for (i = 0; i < names.length; i++) {
			String arr[] = new String[names[i].length()];

//			for (int j = 0; j < names[i].length(); j++) {
//
//				if (search_name.length() == names[i].length() && search_name.charAt(j) == names[i].charAt(j)) {
//				
//					System.out.println();
//					flag = true;
//					break;
//
//				}
//
//			}
			
			if(names[i].equals(search_name)) {
				flag = true;
				break;
			}

		}

		if (flag == true) {
			System.out.println("found");
		} else {
			System.out.println("Not Found");
		}

	}

}
