package multiplication;
//import java.util.Arrays;
import java.util.Scanner;

public class Array {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Search your number");
		int input = obj.nextInt();
		
//		int arr[] = new int[] {10,24,40,10};
//		int[] arr = {10,23,50,20};
		int[] arr = new int[] {10,23,10,12};
		int flag = 0;
		for(int i = 0; i <= arr.length - 1; i++) {
			if(input == arr[i]) {
				System.out.println(input + "is found at " + i);
				flag = 1;
				break;
			}
		}
		
		if(flag == 0) {
			System.out.println("Not Found");
		}
		
		
	}
}
