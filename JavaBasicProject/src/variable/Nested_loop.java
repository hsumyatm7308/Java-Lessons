package variable;
import java.util.Scanner;
public class Nested_loop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of lines");
		int l = Integer.parseInt(sc.nextLine());
		System.out.println("Enter number of stars");
		int s = Integer.parseInt(sc.nextLine());
		
		for(int line = 1; line <= l; line++) {
			for(int star = 1; star <= s;star++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
