package assignment;

import java.util.Scanner;

public class assignment9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter register code");

		String reg_code = sc.nextLine();
		String num = "1234567890";
		boolean flag = false;

		if (reg_code.length() == 7) {
			
			for (int i = 0; i <= 6; i++) {
				flag = false;
				if(i != 1) {
					if (reg_code.charAt(i) >= 65 && reg_code.charAt(i) <= 90) {
						flag = true;
					}		
				}
				
				if(i >= 2 && i <= 3) {
					if(num.contains(String.valueOf(reg_code.charAt(i)))) {
						flag = true;
					}
				}
				if(i >= 4) {
					if (reg_code.charAt(i) >= 65 && reg_code.charAt(i) <= 90) {
						flag = true;
					}
				}

			}
			
		}else {
			System.out.println("code must be 7");
		}
		
		System.out.println(flag);


	}

}
