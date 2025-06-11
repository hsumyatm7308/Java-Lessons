package multiplication;

import java.util.Scanner;

public class exercise13 {
//	static double power(double n,double p) {
//		double result = Math.pow(n, p);	
//		return result;
//	}
	
	
//	with sensei 
	static double power(double n,double p) {
		double result =1;	
		for(int i = 0; i <p; i++) {
			result *= n;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");	
		int n = Integer.parseInt(sc.nextLine());
		System.out.println("Enter power");	
		int p = Integer.parseInt(sc.nextLine());
		System.out.println(power(n,p));

	}

}
