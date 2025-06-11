package variable;
import java.util.Scanner;
public class Triangle_star {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of lines");
		int l = Integer.parseInt(sc.nextLine());
		
		for (int line = 1; line <= l; line++) {
			for (int space = 1; space <= l - line; space++) {
				System.out.print(" ");
			}

			for (int star = 1; star <= line * 2 - 1; star++) {
				System.out.print("*");

			}
			System.out.println();
		}

	}

}
