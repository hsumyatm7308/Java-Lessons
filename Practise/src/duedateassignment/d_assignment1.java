package duedateassignment;

import java.util.Scanner;

public class d_assignment1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int input = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i <= 12; i++) {
			System.out.println(input + " * " + i + " = " + input * i);
		}
		
	}

}
