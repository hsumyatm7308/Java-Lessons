package variable;

import java.util.Scanner;

public class Arithmetic_switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice = "yes";
		// while(choice.equals("yes"))
		// {
		// System.out.println("Enter First Number");
		// int first_num = Integer.parseInt(sc.nextLine());
		// System.out.println("Enter an operator");
		// char op = sc.nextLine().charAt(0);
		//
		// System.out.println("Enter Second Number");
		// int second_num = Integer.parseInt(sc.nextLine());
		//
		// // if(op == '+') {
		// // int sum = first_num + second_num;
		// // System.out.println("Addition = " + sum);
		// // }else if(op == '-'){
		// // int minus = first_num - second_num;
		// // System.out.println("Sustration = " + minus);
		// // }else if(op == '*') {
		// // int multi = first_num * second_num;
		// // System.out.println("Multiplication = " + multi);
		// // }else if(op == '%') {
		// // int module = first_num % second_num;
		// // System.out.println("Modules = " + module);
		// // }else if(op == '/') {
		// // int quotient = first_num / second_num;
		// // System.out.println("Multiplication = " + quotient);
		// // }else {
		// // System.out.println("Invalid Operator");
		// // }
		//
		// switch (op) {
		// case '+':
		// int sum = first_num + second_num;
		// System.out.println("Addition = " + sum);
		// break;
		// case '-':
		// int minus = first_num - second_num;
		// System.out.println("Sustration = " + minus);
		// break;
		// case '*':
		// int multi = first_num * second_num;
		// System.out.println("Multiplication = " + multi);
		// break;
		// case '%':
		// int module = first_num % second_num;
		// System.out.println("Modules = " + module);
		// break;
		// case '/':
		// int quotient = first_num / second_num;
		// System.out.println("Multiplication = " + quotient);
		// break;
		// default:
		// System.out.println("Invalid Operator");
		//
		// }
		//
		// System.out.println("Do anoter(yes/no) ?");
		// choice = sc.nextLine();
		// }
		// }
		//

		do {
			System.out.println("Enter First Number");
			int first_num = Integer.parseInt(sc.nextLine());
			System.out.println("Enter an operator");
			char op = sc.nextLine().charAt(0);

			System.out.println("Enter Second Number");
			int second_num = Integer.parseInt(sc.nextLine());
			switch (op) {
			case '+':
				int sum = first_num + second_num;
				System.out.println("Addition = " + sum);
				break;
			case '-':
				int minus = first_num - second_num;
				System.out.println("Sustration = " + minus);
				break;
			case '*':
				int multi = first_num * second_num;
				System.out.println("Multiplication = " + multi);
				break;
			case '%':
				int module = first_num % second_num;
				System.out.println("Modules = " + module);
				break;
			case '/':
				int quotient = first_num / second_num;
				System.out.println("Multiplication = " + quotient);
				break;
			default:
				System.out.println("Invalid Operator");

			}

			System.out.println("Do anoter(yes/no) ?");
			choice = sc.nextLine();
		} while (choice.equals("yes"));
	}

}
