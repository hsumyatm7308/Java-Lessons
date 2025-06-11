package multiplication;

import java.util.Scanner;

public class exercise7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start number");
		int input = Integer.parseInt(sc.nextLine());
		System.out.println("Enter end number");
		int target = Integer.parseInt(sc.nextLine());

		for (int i = 1; i <= target; i++) {
			System.out.println(input + " * " + i + " = " + input * i);

		}

	}
}
