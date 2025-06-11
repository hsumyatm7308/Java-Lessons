package multiplication;

import java.util.Scanner;

public class exercise8_manual {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter word");
		String word = sc.nextLine();

		if (word.length() == 2) {
			System.out.println("Enter whole num");
			int whole_num = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter decimal num");
			float float_num = Float.parseFloat(sc.nextLine());
			int int_part = (int) float_num;

			// reverse word
		    String reverse = "";
			for (int i = 0; i < word.length(); i++) {
				reverse = word.charAt(i) + reverse;
			}
			System.out.println(whole_num + reverse + int_part);

	
		} else {
			System.out.println("Invalid");
		}
		

	}

}
