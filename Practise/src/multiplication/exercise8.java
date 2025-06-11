package multiplication;

import java.util.Scanner;

public class exercise8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");
		StringBuilder word = new StringBuilder(sc.nextLine());
		word.reverse();
		
		if (word.length() <= 2) {
			System.out.println("Enter a whole number");
			String whole_num = sc.nextLine();
			
			System.out.println("Enter a decimal number");
			float decimal_num = Float.parseFloat(sc.nextLine());
			int int_part_of_decimal = (int) decimal_num;
			System.out.println(int_part_of_decimal);
			
			System.out.println( whole_num + word + int_part_of_decimal);
			
		} else {
			System.out.println("Your words must be only 2");
		}

	}

}
