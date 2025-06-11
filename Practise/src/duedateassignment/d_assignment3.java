package duedateassignment;

import java.util.Scanner;

public class d_assignment3 {
	static boolean isLeapYear(int year) {
		boolean flag = false;
		if (year % 100 == 0 && year % 400 == 0) {
			flag = true;
		} else if (year % 100 == 0) {
			flag = false;
		} else if (year % 4 == 0) {
			flag = true;
		}
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String choice = "yes";
		while(choice.equals("yes")) {
			System.out.println("Enter year");
			int year = Integer.parseInt(sc.nextLine());
			if(isLeapYear(year)) {
				System.out.println("This is leap year");
			}else {
				System.out.println("This is not leap year");
			}
			
			System.out.println("Do you want another (yes/no)?");
			choice = sc.nextLine();

		}

	}

}
