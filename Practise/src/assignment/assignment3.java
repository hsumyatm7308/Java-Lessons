package assignment;

import java.util.Scanner;

public class assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] denaryPlaceholders = { 128, 64, 32, 16, 8, 4, 2, 1 };
		String binaryPattern = "";
		int denaryNumber = 0;
		int count = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter binary number");
		String bi_char = sc.nextLine();
		
		while(bi_char.length() != 8) {
			System.out.println("number is not excetly 8 yet");
			bi_char = sc.nextLine();
		}
		
		int arr[] = new int[8];

		for(int i = 0; i < arr.length; i++) {
//			int intbinary = Integer.parseInt(bi_char);
//			System.out.println(intbinary);
			arr[i]  = bi_char.charAt(i);
			System.out.println(arr[i]);

		}

	

	}

}
