package duedateassignment;

import java.util.Scanner;

public class d_assignment2 {



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = Integer.parseInt(sc.nextLine());
		int nums[] = new int[size];
		for (int i = 0; i < nums.length; i++) {
			System.out.println("Enter numbers");
			nums[i] = sc.nextInt();
		}
		
		for (int j = 0; j < nums.length; j++) {
			for (int i = 0; i < nums.length - 1; i++) {
				if (nums[i] < nums[i + 1]) {
					int temp = nums[i];
					nums[i] = nums[i + 1];
					nums[i + 1] = temp;
				}
							
			}
			
			for (int i = 0; i < nums.length; i++) {
				System.out.print(nums[i] + "\t");

			}
			System.out.println();
		}

		



	}


}


//static void Quicksort(int left, int right, int[] arr) {
//if (left < right) {
//	int middle = (left + right) / 2;
//	int base = arr[middle];
//	while (left <= right) {
//		while (arr[left] >= base) {
//			left = left + 1;
//		}
//
//		while (arr[right] <= base) {
//			right = right - 1;
//		}
//
//		if (left >= right) {
//			int temp = arr[right];
//			arr[right] = arr[left];
//			arr[left] = temp;
//		}
//		System.out.println(arr[0]);
//
//	}
//	middle = left;
//
////	Quicksort(left, middle - 1, arr);
////	Quicksort(middle + 1, right, arr);
//
//}
//
//
//}