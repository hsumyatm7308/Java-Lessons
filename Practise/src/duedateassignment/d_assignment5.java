package duedateassignment;

import java.util.Scanner;

public class d_assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String code;
		
		// request input with 10 length
		while (true) {
			System.out.println("Enter code:");
			code = sc.nextLine();

			if (code.length() == 10) {
				break;
			} else {
				System.out.println("Code must be 10 length.");
			}
		}

		String number = code.substring(3, 9);
		String upper = code.substring(0, 3);
		char lastchar = code.charAt(9);
		boolean flag = true;

		// check characters
		for (int i = 0; i < upper.length(); i++) {
			if (!Character.isUpperCase(upper.charAt(i))) {
				flag = false;
				break;
			}
		}

		// check number
		int sum = 0;
		for (char c : number.toCharArray()) {
			if (!Character.isDigit(c)) {
				flag = false;
				break;
			}
			sum += c - '0';
		}
		char checklast = (sum % 2 == 0) ? 'e' : 'o';

		// check last character
		if (checklast != lastchar) {
			flag = false;
		}

		String result = flag == true ? "This code is valid" : "This is not valid";
		System.out.println(result);

	}

}

//for (int i = 0; i <= number.length() - 1; i++) {
//if (Character.isDigit(number.charAt(i))) {
//	int digit = number.charAt(i) - '0'; // char to int
//	sum = sum + digit;
//} else {
//	sum = 0;
//	flag = false;
//	break;
//}
//}
