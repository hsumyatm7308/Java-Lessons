package multiplication;

import java.util.Scanner;

public class Multiple {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter your number");
		
		int input = obj.nextInt();
		int end = obj.nextInt();
		
		for(int i = 1; i <= end; i++) {
			System.out.println(input + "*" + i + "=" + input * i);
		}
		
		
			
		
	}
}
