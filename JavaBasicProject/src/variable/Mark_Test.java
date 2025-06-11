package variable;

import java.util.Scanner;

public class Mark_Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter mark");
		int mark = Integer.parseInt(sc.nextLine());
		if (mark <= -1 && mark > 100) {

			if (mark >= 80) {
				System.out.println("A");
			} else if (mark >= 70) {
				System.out.println("B");
			} else if (mark >= 60) {
				System.out.println("C");
			} else if (mark >= 50) {
				System.out.println("D");
			} else {
				System.out.println("F");
			}
		}else {
			System.out.println("Mark must be between 0 to 100");
		}

	}

}
