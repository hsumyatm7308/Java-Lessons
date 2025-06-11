package methods;

import java.util.Scanner;

public class Arithmetics_Method {
	
	static int add(int a, int b ) {
		return a + b;
	}
	
	static int sub(int a, int b) {
		return a - b;
	}
	
	static int multi(int a, int b) {
		return a * b;
	}
	
	static int quotient(int a, int b) {
		return a / b;
	}

	static int module(int a, int b) {
		return a % b;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.println("Enter operator number");
		char op = sc.nextLine().charAt(0);
		System.out.println("Enter second number");
		int num2 = Integer.parseInt(sc.nextLine());
		int result = 0 ;
		String choice = "yes";
		while(choice.equals("yes")) {

		switch (op) {
		case '+':
			 result = add(num1,num2);
			break;
		case '-':
			 result = sub(num1,num2);

			break;
		case '*':
			 result = multi(num1,num2);

			break;
		case '/':
			 result = quotient(num1,num2);

			break;
		case '%':
			 result = module(num1,num2);

			break;
		default:
			System.out.println("Invalid operator");
		}
		
		
		System.out.println(num1 + " " + op + " " + num2 + " = " + result);
		System.out.println("Do another (yes/no)?");
		choice = sc.nextLine();
		}

	}

}
