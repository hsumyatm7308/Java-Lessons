package multiplication;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPosition {
	public static void main(String args[]) {
		int array[] = new int[] {13,16,30};
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter your search number");
		int search = obj.nextInt();
		
		boolean flag = false;

		for(int i = 0; i <= array.length - 1; i++) {
			
			if(search == array[i]) {
				System.out.println(i);
				flag = true;
				break;
			}
						
		}
		
		
		if(flag == false) {
			System.out.println("Not found");
		}
		
		
	}

}
