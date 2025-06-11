package multiplication;

import java.util.Scanner;

public class exercise17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		
		int size = Integer.parseInt(sc.nextLine());
		String names[] = new String[size];
		for(int i = 0; i < size; i++) {
			System.out.println("enter name" );
			names[i] = sc.nextLine();
		
		}
		
		System.out.println("Enter search name");
		String search = sc.nextLine();
		boolean flag = false;
		int i ; 
		for(i =0; i < names.length; i++) {
			if(search.compareTo(names[i]) == 0) {
				flag = true;
				break;
			}
		}
		
		if(flag) {
			System.out.println("Found in index " + i);
		}else {
			System.out.println("Not found");
		}


	}

}
