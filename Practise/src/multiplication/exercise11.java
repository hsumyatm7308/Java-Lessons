package multiplication;

import java.util.Scanner;

public class exercise11 {

	public static void main(String[] args) {
//Write  a program that accepts the search name from user and results that name is found or not.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String search_name = sc.nextLine();
		String names[] = {"Aung","Maung","S"};
		int i= 0;
		boolean flag = false;
		
		for(i = 0; i < names.length; i++) {
			if(names[i].equals(names[i+1])) {
				flag = true;
				break;
			}
		}
		
		if(flag == true) {
			System.out.println("found");
		}else {
			System.out.println("Not Found");
		}
		

	}

}



//Scanner sc = new Scanner(System.in);
//System.out.println("Enter array size");
//int size = sc.nextInt();
//String names[] = new String[size];
//for(int i = 0; i < size; i++) {
//	System.out.println("Enter name");
//	names[i] = sc.next();
//}
//
//System.out.println("Enter search names:");
//String search = sc.nextLine();
//boolean flag = false;
//int i;
//for(i=0;i<names.length;i++) {
//	if(search.compareTo(names[i])==0) {
//		flag = true;
//		break;
//	}
//}
//if(flag) {
//	System.out.println("Found in index" + i);
//	
//}else {
//	System.out.println("not found");
//}