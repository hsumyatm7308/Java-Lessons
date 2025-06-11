package homework;

import java.util.Scanner;

public class star_hw6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of line");
		int L = Integer.parseInt(sc.nextLine());
		System.out.println("Enter number of star");
		int S = Integer.parseInt(sc.nextLine());
		
		for(int line = 1; line <= L; line++ ) {
			for(int space = 1; space <= L - line; space++) {
				System.out.print(" ");
			}
			for( S = 1; S <= line * 2 - 1; S++) {
				System.out.print("*");
			}
			System.out.println();
		}

		


		
		
		
	}

}
